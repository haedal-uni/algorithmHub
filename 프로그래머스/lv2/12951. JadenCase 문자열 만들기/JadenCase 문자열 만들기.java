import java.lang.*;
import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        sb.append(s.split("")[0].toUpperCase());
        for(int i=1; i<s.length(); i++){
            if((int) s.split("")[i-1].charAt(0)== 32 && (int) s.split("")[i].charAt(0)>=65){
                sb.append(s.split("")[i].toUpperCase());
            }else{
                sb.append(s.split("")[i]);
            }
        }
        return sb.toString();
    }
}
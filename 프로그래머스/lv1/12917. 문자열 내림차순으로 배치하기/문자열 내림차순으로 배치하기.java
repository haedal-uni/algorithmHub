import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] ss = s.split("");
        Arrays.sort(ss, Collections.reverseOrder());
        for(int i=0; i<ss.length; i++){
            sb.append(ss[i]);
        }
        return sb.toString();
    }
}
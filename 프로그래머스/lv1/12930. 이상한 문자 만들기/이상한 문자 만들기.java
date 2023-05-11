import java.lang.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int num=0;
        for(int i=0; i<s.length(); i++){
            if(s.split("")[i].equals(" ")){
                num = 0;
                sb.append(" ");
            }else{
                if(num%2==0){
                    sb.append(s.split("")[i].toUpperCase());
                }else{
                    sb.append(s.split("")[i].toLowerCase());
                }
                num++;
            }
        }
        return sb.toString();
    }
}
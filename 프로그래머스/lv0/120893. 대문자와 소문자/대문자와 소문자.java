import java.lang.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] ans = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            if((int) ans[i].charAt(0) >= 97){
                sb.append(ans[i].toUpperCase());
            }else{
                sb.append(ans[i].toLowerCase());
            }
        }
        return sb.toString();
    }
}
import java.lang.*;
class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        String[] ans1 = str1.split("");
        String[] ans2 = str2.split("");
        for(int i=0; i<str1.length(); i++){
            sb.append(ans1[i]).append(ans2[i]);
        }
        return sb.toString();
    }
}
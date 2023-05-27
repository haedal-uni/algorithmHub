import java.lang.*;
class Solution {
    public String solution(String s, int n) {
        int a = 0;
        char b =  '\0';
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.split("")[i].equals(" ")){
                a = s.charAt(i);
            }else if((int)s.charAt(i)+n > 90 && (int)s.charAt(i) <= 90 || (int)s.charAt(i)+n > 122 && (int)s.charAt(i) <= 122){
                a = s.charAt(i)+n-26;
            }
            else{
                a = s.charAt(i)+n;
            }
            b = (char) a;
            sb.append(b);
        }
        return sb.toString();
    }
}
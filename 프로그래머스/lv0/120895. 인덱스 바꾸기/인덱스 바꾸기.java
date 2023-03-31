import java.util.Arrays;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] ms = new String[my_string.length()];
        for (int i=0; i<my_string.length(); i++){
            ms[i] = my_string.split("")[i];
        }
        String temp = ms[num1];
        ms[num1] = ms[num2];
        ms[num2] = temp;
        for (int i=0; i<ms.length; i++){
            answer +=ms[i];
        }
        return answer;
    }
}
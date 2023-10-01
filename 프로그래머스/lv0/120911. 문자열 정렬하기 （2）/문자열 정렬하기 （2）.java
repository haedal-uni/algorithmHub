import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        my_string = my_string.toLowerCase();
        String[] answer = my_string.split("");
        Arrays.sort(answer);
        for(int i=0; i<answer.length; i++){
            sb.append(answer[i]);
        }
        return sb.toString();
    }
}
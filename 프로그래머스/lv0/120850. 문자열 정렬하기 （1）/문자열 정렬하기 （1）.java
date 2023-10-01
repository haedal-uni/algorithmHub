import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        StringBuilder sb = new StringBuilder();
        String[] ans = my_string.split("");
        for(int i=0; i<ans.length; i++){
            if((int) ans[i].charAt(0) < 58){
                sb.append(ans[i]);
            }
        }
        answer = new int[sb.toString().length()];
        String a = sb.toString();
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(a.split("")[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}
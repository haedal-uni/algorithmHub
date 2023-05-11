import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string, " ");
        String[] answer = new String[st.countTokens()];
        for(int i=0; i<st.countTokens(); i++){
            answer[i] = my_string.split(" ")[i];
        }
        return answer;
    }
}
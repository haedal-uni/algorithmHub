import java.lang.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(s,e+1));
        String answer = my_string.substring(0,s) + sb.reverse()+my_string.substring(e+1);
        return answer;
    }
}
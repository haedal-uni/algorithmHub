import java.lang.*;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        String num = my_string.substring(0, s);
        String num1 = my_string.substring(s+overwrite_string.length());
        sb.append(num).append(overwrite_string).append(num1);
        return sb.toString();
    }
}
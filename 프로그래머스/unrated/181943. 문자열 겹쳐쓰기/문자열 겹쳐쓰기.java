class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String num = my_string.substring(0, s);
        String num1 = my_string.substring(s+overwrite_string.length());
        return num + overwrite_string + num1;
    }
}
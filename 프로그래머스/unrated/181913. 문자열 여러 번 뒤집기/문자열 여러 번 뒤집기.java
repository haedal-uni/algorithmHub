import java.lang.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        int start = 0;
        int end = 0;
        for(int i=0; i<queries.length; i++){
            start = queries[i][0];
            end = queries[i][1];
            String world= sb.toString().substring(start, end+1);
            StringBuilder sr = new StringBuilder(world);
            String reveStr = sr.reverse().toString();
            sb.replace(start, end+1, reveStr);
        }
        return sb.toString();
    }
}
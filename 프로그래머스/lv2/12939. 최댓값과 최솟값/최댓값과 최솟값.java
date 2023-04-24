import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(s.split(" ")[i]);
        }
        Arrays.sort(arr);
        sb.append(arr[0]).append(" ").append(arr[arr.length-1]);
        return sb.toString();
    }
}
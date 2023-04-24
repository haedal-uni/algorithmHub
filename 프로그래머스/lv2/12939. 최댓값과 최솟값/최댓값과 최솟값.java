import java.util.*;
class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int count = st.countTokens();
        String answer = "";
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(s.split(" ")[i]);
        }
        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length-1];
        return answer;
    }
}
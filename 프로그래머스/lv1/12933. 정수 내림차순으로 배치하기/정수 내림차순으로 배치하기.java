import java.util.*;
class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = Integer.parseInt(s.split("")[i]);
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}
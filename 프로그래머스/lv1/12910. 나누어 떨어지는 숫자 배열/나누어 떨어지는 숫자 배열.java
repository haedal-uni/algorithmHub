import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        StringBuilder sb = new StringBuilder();
        int[] answer;
        Arrays.sort(arr);
        int num=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                sb.append(arr[i]).append(" ");
                num++;
            }
        }        
        if(num==0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[num];
            for(int i=0; i<num; i++){
                answer[i] = Integer.parseInt(sb.toString().split(" ")[i]);
            }
        }
        return answer;
    }
}
import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int sum = 100;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(sum>Math.abs(n-array[i])){
                sum = Math.abs(n-array[i]);
                answer = array[i];
            }else if(sum==Math.abs(n-array[i])){
                if(answer>array[i]){
                    answer = array[i];
                }
            }else{
                break;
            }
        }
        return answer;
    }
}
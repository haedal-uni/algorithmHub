import java.util.Arrays;
import java.lang.Math;
class Solution {
    public int solution(int[] numbers) {
        int answer = 1; 
        int[] nums = numbers;
        int count = 0;
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] !=Math.abs(nums[i])){
                answer *= numbers[i];
                count++;
            }
        }
        Arrays.sort(numbers);
        if (numbers[numbers.length-1]*numbers[numbers.length-2] > answer || count<2){
            answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        }
        return answer;
    }
}
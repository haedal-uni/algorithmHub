import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int first = numbers[numbers.length-1];
        int second = numbers[numbers.length-2];
        answer = first*second;
        return answer;
    }
}
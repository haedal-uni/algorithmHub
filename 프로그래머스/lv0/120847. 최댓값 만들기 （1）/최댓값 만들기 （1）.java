class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int num = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                num = max;
                max = numbers[i];
            }
            else {
                if (num < numbers[i]){
                    num = numbers[i];
                }
            }
        }
        answer = num * max;
        return answer;
    }
}
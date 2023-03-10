class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i =0; i<numbers.length; i++){
            answer += numbers[i];
        }
        double num = answer/numbers.length;
        if (num%1==.0 || num%1==.5){
            answer = num;
        } else{
            answer = (int) num;
        }
        return answer;
    }
}
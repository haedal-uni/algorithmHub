class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i=0;
        while(true){
            if(answer>n){
                break;
            }
            answer+= numbers[i];
            i++;
        }
        return answer;
    }
}
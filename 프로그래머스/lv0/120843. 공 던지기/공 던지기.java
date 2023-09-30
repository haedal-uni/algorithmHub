class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 2*k-1;
        while(true){
            if(answer<=numbers.length){
                break;
            }
            answer -= numbers.length;
        }
        return answer;
    }
}
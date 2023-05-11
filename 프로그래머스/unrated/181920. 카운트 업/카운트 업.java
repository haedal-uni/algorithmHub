class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int num = 0;
        for(int i=start; i<end+1; i++){
            answer[num] = i;
            num++;
        }
        return answer;
    }
}
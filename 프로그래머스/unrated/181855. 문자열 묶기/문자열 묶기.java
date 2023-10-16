class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        int max = 0;
        for(int i=0; i<strArr.length; i++){
            answer[strArr[i].length()]++;
            if(max<answer[strArr[i].length()]){
                max = answer[strArr[i].length()];
            }
        }
        return max;
    }
}
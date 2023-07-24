class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int num=0;
        int len1 = intervals[0][1]-intervals[0][0]+1;
        int len2 = intervals[1][1] - intervals[1][0]+1;
        int[] answer = new int[len1+len2];
        for(int i=intervals[0][0]; i<intervals[0][1]+1; i++){
            answer[num] = arr[i];
            num++;
        }
        for(int i=intervals[1][0]; i<intervals[1][1]+1; i++){
            answer[num] = arr[i];
            num++;
        }
        return answer;
    }
}
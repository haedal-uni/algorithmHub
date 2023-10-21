class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i<queries.length; i++){
            num1 = queries[i][0];
            num2 = queries[i][1];
            for(int j=num1; j<=num2; j++){
                arr[j]++;
            }
        }
        return arr;
    }
}
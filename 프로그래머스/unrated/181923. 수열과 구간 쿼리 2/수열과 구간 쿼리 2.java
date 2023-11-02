class Solution {
    static int[] arr1;
    public int[] solution(int[] arr, int[][] queries) {
        arr1 = arr;
        int[] answer = new int[queries.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = x(queries[i][0], queries[i][1], queries[i][2]);
        }
        return answer;
    }
    public int x(int a, int b, int c){
        int num = 1000001;
        for(int i=a; i<b+1; i++){
            if(arr1[i]>c&& num>arr1[i]){
                num = arr1[i];
            }
        }
        if(num==1000001){
            num = -1;
        }
        return num;
    }
}
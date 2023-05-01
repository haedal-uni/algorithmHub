class Solution {
    static int[] arr;
    public int solution(int n) {
        arr = new int[n+1];
        int answer = fibo(n);
        return answer;
    }
    public int fibo(int n){
        if(n<2){
            return n;
        }else if(arr[n] !=0){
            return arr[n];
        }
        return arr[n] = (fibo(n-1) + fibo(n-2))%1234567;
    }
}
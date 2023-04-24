class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = A(n, m);
        answer[1] = B(n, m);
        return answer;
    }
    public int A(int a, int b){
        if (a%b==0){
            return b;
        }
        return A(b, a%b);
    }
    public int B(int a, int b){
        return a*b/A(a, b);
    }
}
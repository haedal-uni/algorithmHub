class Solution {
    public int solution(int n) {
        return B(n, 6)/6;
    }
    public int A(int a, int b){
        if(a%b==0){
            return b;
        } return A(b, a%b);
    }
    public int B(int a, int b){
        return a*b/A(a,b);
    }
}
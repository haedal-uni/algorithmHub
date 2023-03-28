class Solution {
    public int solution(int n) {//10
        int answer = 0;
        int x=6;
        int num=n;
        if (n>x){
            x = n; 
            n = 6; 
        }
        while(n!=0){ 
            answer=x%n;
            x=n;
            n=answer;
        }
        return num/x;
    }
}
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(eq.equals("!")){
            if(n>m && ineq.equals(">")){
                answer = 1;
            }
            if(n<m && ineq.equals("<")){
                answer = 1;
            }
        }else{
            if(n>m && ineq.equals(">") || n==m && ineq.equals(">")){
                answer = 1;
            }
            if(n<m && ineq.equals("<") || n==m && ineq.equals("<")){
                answer = 1;
            }
        }
        return answer;
    }
}
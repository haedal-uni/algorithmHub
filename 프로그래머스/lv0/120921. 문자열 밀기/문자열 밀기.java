class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int count = 0;
        if(!A.equals(B)){
           while(true){
            if(A.equals(B)){
                break;
            }else if(count==A.length()){
                answer = -1;
                break;
            }
               A = A.substring(A.length()-1) + A.substring(0,A.length()-1);
               count++;
               answer++;
           } 
        }
        return answer;
    }
}
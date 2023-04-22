class Solution {
    public String solution(String s) {
        String answer = "";
        int num = s.length()/2 + s.length()%2;
        if(s.length()%2==0){
            answer = s.split("")[num-1] + s.split("")[num];
        }else{
            answer = s.split("")[num-1];
        }
        return answer;
    }
}
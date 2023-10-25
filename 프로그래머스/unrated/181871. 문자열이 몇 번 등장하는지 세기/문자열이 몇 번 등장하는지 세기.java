class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int first = myString.indexOf(pat);
        if(first!=-1){
            answer+=1;
            while(true){
                first = myString.indexOf(pat, first+1);
                if(first==-1){
                    break;
                } 
                answer++;
            }
        }else if(first!=-1){
            answer+=1;
        }
        return answer;
    }
}
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for(int i=0; i<before.length(); i++){
            after = after.replaceFirst(before.split("")[i], "");
        }
        if(after.length()==0){
            answer = 1;
        }
        return answer;
    }
}
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder();
        myStr = myStr.replaceAll("a"," ").replaceAll("b", " ").replaceAll("c", " ").strip();
        if(myStr.length() == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }else{
            answer = myStr.split(" ");
            for(int i=0; i<answer.length; i++){
                if(!answer[i].isBlank()){
                    sb.append(answer[i]).append(" ");
                }
            }
            String[] ans = sb.toString().split(" ");
            return ans;
        }
    }
}
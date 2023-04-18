class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(my_string.split("")[i])){
                answer = answer.concat(my_string.split("")[i]);
            }
        }
        return answer;
    }
}
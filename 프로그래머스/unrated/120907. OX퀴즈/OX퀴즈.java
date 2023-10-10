class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        String ans = "";
        for(int i=0; i<quiz.length; i++){
            num1 =  Integer.parseInt(quiz[i].split(" ")[0]);
            ans = quiz[i].split(" ")[1];
            num2 = Integer.parseInt(quiz[i].split(" ")[2]);
            num3 = Integer.parseInt(quiz[i].split(" ")[4]);
            if(ans.equals("-")){
                if(num1-num2==num3){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                if(num1+num2==num3){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
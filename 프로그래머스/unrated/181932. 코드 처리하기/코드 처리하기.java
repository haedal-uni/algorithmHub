class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] ans = code.split("");
        for(int i=0; i<ans.length; i++){
            if(mode==0){
                if(ans[i].equals("1")){
                    mode = 1;
                }else{
                    if(i%2==0){
                        answer+= ans[i];
                    }
                }
            }else{
                if(!ans[i].equals("1")){
                    if(i%2==1){
                        answer+= ans[i];
                    }
                }else{
                    mode = 0;
                }
            }
        }
        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}
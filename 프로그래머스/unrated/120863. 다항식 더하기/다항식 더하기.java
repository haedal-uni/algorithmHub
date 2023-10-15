class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int num = 0;
        String[] ans = polynomial.split(" ");
        for(int i=0; i<ans.length; i++){
            if(ans[i].contains("x")){
                if(ans[i].replace("x", "").length()==0){
                    x += 1;
                }else{
                    x += Integer.parseInt(ans[i].replace("x",""));
                }
            } else if(!ans[i].equals("+")){
                num += Integer.parseInt(ans[i]);
            }
        }
        if(x > 1){
            if(num > 0){
                answer += x + "x" + " + " + num ;
            }else{
                answer += x + "x";
            }
        }else if(x==1){
            if(num > 0){
                answer += "x" + " + " + num ;
            }else{
                answer += "x";
            }
        }else{
            answer += "" + num;
        }
        return answer;
    }
}
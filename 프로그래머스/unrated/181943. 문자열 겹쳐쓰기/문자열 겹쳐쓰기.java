class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] ans = overwrite_string.split("");
        String[] myS = my_string.split("");
        int num = 0;
        for(int i=0; i<my_string.length(); i++){
            if(num<ans.length && i>s-1){
                answer+= ans[num];
                num++;
            }else{
                answer+=myS[i];
            }
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string, " ");
        int num = 0;
        boolean status = false;
        String[] answer = new String[st.countTokens()];
        for(int i=0; i<my_string.length(); i++){
            if(!my_string.split("")[i].equals(" ")){
                status = true;
            }else{ 
                if(status){
                    answer[num] = st.nextToken();
                    num++;
                    status = false;
                }
           }   
        }
        if((num+1)==answer.length){
            answer[num] = st.nextToken();
        }
        return answer;
    }
}
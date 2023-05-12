import java.lang.*;
class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                sb.append(num_list[i]);
            }else{
                sb1.append(num_list[i]);
            }
        }
        answer = Integer.parseInt(sb.toString()) + Integer.parseInt(sb1.toString());
        return answer;
    }
}
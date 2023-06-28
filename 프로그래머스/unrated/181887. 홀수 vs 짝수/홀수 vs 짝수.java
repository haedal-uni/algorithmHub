import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int num = 0;
        int num1 = 0;
        for(int i=0; i<num_list.length; i++){
            if((i+1)%2==0){
                num+=num_list[i];
            }else{
                num1+=num_list[i];
            }
        }
        return Math.max(num, num1);
    }
}
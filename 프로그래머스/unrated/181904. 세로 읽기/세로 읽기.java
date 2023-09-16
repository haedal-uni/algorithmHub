import java.lang.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String[] ans = my_string.split("");
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i=0; i<ans.length; i++){
            num = (c-1)+ m*i;
            if(num<ans.length){
                sb.append(ans[num]);
            }
        }
        return sb.toString();
    }
}
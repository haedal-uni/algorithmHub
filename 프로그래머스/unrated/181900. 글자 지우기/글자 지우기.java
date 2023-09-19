import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String[] ans = my_string.split("");
        int cnt = 0;
        Arrays.sort(indices);
        for(int i=0; i<ans.length; i++){
            if(i == indices[cnt]){
                cnt++;
                if(cnt==indices.length){
                    cnt = 0;
                }
            }else{
                sb.append(ans[i]);
            }
        }
        return sb.toString();
    }
}
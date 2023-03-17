import java.util.List;
import java.util.ArrayList;
class Solution {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<n+1; i++){
            if(i%2==1){
                answer.add(i);
            }
        }
        return answer;
    }
}
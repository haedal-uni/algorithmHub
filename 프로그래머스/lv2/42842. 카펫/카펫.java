import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<(sum/2)+1; i++){
            if(sum%i==0 && i>2){
                list.add(i);
            }
        }
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if((list.get(i)-2)*(list.get(j)-2)==yellow && (list.get(i)*list.get(j))-brown ==yellow){
                    answer[0]=list.get(i);
                    answer[1]=list.get(j);
                }
            }
        }

        return answer;
    }
}
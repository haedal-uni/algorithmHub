import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 7;
        int num = 0;
        List<Integer> lotto = new ArrayList<>();
        List<Integer> win = new ArrayList<>();
        for(int i=0; i<lottos.length; i++){
            lotto.add(lottos[i]);
            win.add(win_nums[i]);
        }
        for(int i=0; i<lottos.length; i++){
            if(lotto.contains(win.get(i))){
                count--;
            }
            if(lotto.get(i)==0){
                num++;
            }
        }
        if(count==7){
            count = 6;
        }
        answer[0] = count - num;
        answer[1] = count;
        if(answer[0]<1){
            answer[0] = 1;
        }
        return answer;
    }
}
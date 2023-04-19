import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<emergency.length; i++){
            list.add(emergency[i]);
        }
        Collections.sort(list);
        for(int i=0; i<emergency.length; i++){
            answer[i] = emergency.length - list.indexOf(emergency[i]);
        }
        return answer;
    }
}
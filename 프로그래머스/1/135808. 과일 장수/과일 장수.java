import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int num = score.length%m;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length-num; i++){
            list.add(score[i+num]);
        }
        for(int i=0; i<list.size(); i+=m){
            answer+= list.get(i)*m;
        }
        return answer;
    }
}
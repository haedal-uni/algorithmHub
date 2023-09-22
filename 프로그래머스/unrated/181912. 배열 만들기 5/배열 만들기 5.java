import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        String ans = "";
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<intStrs.length; i++){
            ans = intStrs[i];
            ans = ans.substring(s, s+l);
            if(Integer.parseInt(ans)>k){
                list.add(Integer.parseInt(ans));
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
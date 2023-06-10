import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int num = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>() ;
        for(int i=0; i<tangerine.length; i++){
            num = map.getOrDefault(tangerine[i],0);
            map.put(tangerine[i], num+1);  
        }
        
        List<Integer> list = new ArrayList(map.values());
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0;i<list.size();i++){
            k -= list.get(i);
            answer++;
            if(k<=0){
                break;
            }
        }
        return answer;
    }
}
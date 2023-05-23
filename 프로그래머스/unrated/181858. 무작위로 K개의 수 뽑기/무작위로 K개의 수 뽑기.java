import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        
        int num=0;
        for(int i=0; i<k; i++){
            if(list.size()!=0){
                answer[i] = list.get(num);
                list.removeAll(Arrays.asList(list.get(num)));
            }
        }
        return answer;
    }
}
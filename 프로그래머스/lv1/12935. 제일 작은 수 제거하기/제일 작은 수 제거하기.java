import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int min = 1000;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
            if(min > arr[i]){
                min = arr[i];
            }
        }
        list.remove(list.indexOf(min));
        int[] answer;
        if(arr.length<2){
            answer = new int[1];
            answer[0] = -1;
        }else{
             answer = new int [arr.length-1];
             for(int i=0; i<list.size(); i++){
                  answer[i] = list.get(i);
            }
        }
        return answer;
    }
}
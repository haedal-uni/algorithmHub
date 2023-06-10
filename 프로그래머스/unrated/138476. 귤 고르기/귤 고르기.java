import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int num = 0;
        Arrays.sort(tangerine);
        int size = tangerine[tangerine.length-1];
        Integer[] array = new Integer[size+1];
        Arrays.fill(array, 0);
        for(Integer i=0; i<tangerine.length; i++){
            num = array[tangerine[i]];
            array[tangerine[i]] = num+1;
        }
        Arrays.sort(array, Collections.reverseOrder());
        int i=0;
        while (true){
            if(k<=0){
                break;
            }
            k -= array[i];
            answer++;
            i++;      
        }
        return answer;
    }
}
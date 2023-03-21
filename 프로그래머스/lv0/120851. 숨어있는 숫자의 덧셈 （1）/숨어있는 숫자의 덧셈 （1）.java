import java.util.Objects;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
 
        for (int i=0; i<number.length; i++){
            for(int j=0; j<my_string.length(); j++){
                if (Objects.equals(my_string.split("")[j],""+number[i]+"")){
                    answer+=number[i];
                }
            }
        }
  
        return answer;
    }
}
import java.lang.*;
class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for(int i=0; i<array.length; i++){
            sb.append(array[i]);
        }
        answer = sb.length() - sb.toString().replaceAll("7", "").length();
        return answer;
    }
}
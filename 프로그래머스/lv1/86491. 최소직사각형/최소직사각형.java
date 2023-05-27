import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int num = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
        }
        int first = sizes[0][0];
        int second = sizes[0][1];
        for(int i=1; i<sizes.length; i++){
            if(sizes[i][0]>first){
                first = sizes[i][0];
            }
            if(sizes[i][1]>second){
                second = sizes[i][1];
            }
        }
        int answer = first * second;
        return answer;
    }
}
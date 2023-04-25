import java.lang.Math;
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int y=0;
        for(long i=x; y<answer.length; i+=x){
            answer[y] = (long) i;
            y++;
        }
        return answer;
    }
}
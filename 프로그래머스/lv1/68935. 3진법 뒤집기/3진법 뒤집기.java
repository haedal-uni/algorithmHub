import java.lang.*;
class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(n,3));
        int answer = Integer.parseInt(sb.reverse().toString(), 3);
        return answer;
    }
}
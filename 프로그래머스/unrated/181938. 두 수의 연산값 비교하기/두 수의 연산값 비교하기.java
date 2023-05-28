import java.lang.*;
class Solution {
    public int solution(int a, int b) {
        int first = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        return Math.max(first, 2*a*b);
    }
}
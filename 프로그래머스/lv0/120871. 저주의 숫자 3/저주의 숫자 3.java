import java.util.ArrayList;
import java.util.List;
class Solution {
       public int solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; true; i++) {
            String num = String.valueOf(i);
            if (i % 3 == 0 || num.contains("3")) {
                continue;
            }
            answer.add(i);
            if (answer.size() == n) {
                break;
            }
        }
        return answer.get(n-1);
    }
}
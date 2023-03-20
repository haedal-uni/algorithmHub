import java.util.Objects;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i=0; i<s1.length; i++){
            for (int j=0; j<s2.length; j++){
                 if (Objects.equals(s1[i], s2[j])){
                    answer+=1;
                }
            }
        }
        return answer;
    }
}
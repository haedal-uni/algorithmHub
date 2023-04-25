import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        List<String> list = Arrays.asList(seoul);
        int num = list.indexOf("Kim");
        sb.append("김서방은 ").append(num).append("에 있다");
        return sb.toString();
    }
}
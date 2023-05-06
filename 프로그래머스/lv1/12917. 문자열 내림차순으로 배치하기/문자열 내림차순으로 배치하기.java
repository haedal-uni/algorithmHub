import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            list.add(s.split("")[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
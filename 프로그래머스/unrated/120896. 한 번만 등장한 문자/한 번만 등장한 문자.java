import java.util.*;
class Solution {
    public String solution(String s) {
        String[] world = s.split("");
        StringBuilder sb = new StringBuilder();
        StringBuilder check = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(list.contains(world[i]) || check.toString().contains(world[i])){
                list.remove(world[i]);
                check.append(world[i]);
            }else{
                list.add(world[i]);
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
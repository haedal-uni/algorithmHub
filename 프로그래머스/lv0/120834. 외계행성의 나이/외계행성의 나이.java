class Solution {
    public String solution(int age) {
        String answer = "";
        String[] name = {"a", "b", "c","d","e","f","g","h","i","j"};
        String a = ""+age+"";
        for(int i = 0; i<a.length(); i++){
            answer += name[Integer.parseInt(a.split("")[i])];
        }
        return answer;
    }
}
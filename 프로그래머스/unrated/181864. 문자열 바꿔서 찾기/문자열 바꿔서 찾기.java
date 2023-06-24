class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String world = "";
        for(int i=0; i<pat.length(); i++){
            if(pat.split("")[i].equals("A")){
                world += "B";
            }else {
                world += "A";
            }
        }
        if(myString.contains(world)){
            answer = 1;
        }
        return answer;
    }
}
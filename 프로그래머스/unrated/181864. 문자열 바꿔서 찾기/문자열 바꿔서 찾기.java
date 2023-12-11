class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace("A","b").replace("B","a");
        if(myString.contains(pat.toLowerCase())){
            answer = 1;
        }
        return answer;
    }
}
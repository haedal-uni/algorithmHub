class Solution {
    public int solution(String t, String p) {
        int size = p.length();
        int answer = 0;
        for(int i=0; i<t.length()-size+1; i++){
            if(Long.parseLong(t.substring(i, size+i)) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
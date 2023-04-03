class Solution {
    int answer = 0;
    public int solution(int i, int j, int k) {
        String a = "" + k;
        for (int x=i; x<j+1; x++){
            String b = ""+x;
            if(b.contains(a)){
                answer += b.length() - b.replaceAll(a,"").length();
            }
        }
        return answer;
    }
       
}
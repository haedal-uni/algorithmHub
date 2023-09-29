class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(before);
        int count = 0;
        int sum = 0;
        for(int i=0; i<before.length(); i++){
            count+= (int) before.charAt(i);
        }
        for(int i=0; i<after.length(); i++){
            sum += (int) after.charAt(i);
        }
        if(after.equals(sb.reverse().toString())){
            answer = 1;
        } else if(count==sum){
            answer = 1;
        }
        return answer;
    }
}
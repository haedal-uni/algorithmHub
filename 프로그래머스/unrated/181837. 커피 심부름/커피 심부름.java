class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String orders : order){
            if(orders.contains("americano") || orders.contains("anything")){
                answer+= 4500;
            }else {
                answer+= 5000;
            }
        }
        return answer;
    }
}
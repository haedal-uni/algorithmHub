class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<num_list.length; i++){
            count = num_list[i];
            while(true){
                if(count==1){
                    break;
                }
                if(count%2==1){
                    count-=1;
                }
                count = count/2;
                answer++;
            }
        }
        return answer;
    }
}
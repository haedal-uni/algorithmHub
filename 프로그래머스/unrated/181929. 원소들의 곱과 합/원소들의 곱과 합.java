class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int ans=0;
        for(int i=0; i<num_list.length; i++){
            answer*=num_list[i];
            ans+=num_list[i];
        }
        if(answer<ans*ans){
            return 1;
        }else{
            return 0;
        }
    }
}
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int num = 0;
        int len = num_list.length;
        if(n==len){
            return num_list;
        }else{
            for(int i=n; i<len; i++){
                answer[num] = num_list[i];
                num++;
                if(num_list.length-1==i){
                    i = -1;
                    len = n;
                }
            } 
        }
        return answer;
    }
}
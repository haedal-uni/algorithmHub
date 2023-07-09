class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int num = n;
        for(int i=0; i<num_list.length; i++){
            if(num==num_list.length){
                num=0;
            }
            answer[i] = num_list[num];
            num++;
        }
        return answer;
    }
}
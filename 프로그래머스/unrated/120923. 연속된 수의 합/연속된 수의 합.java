class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total/num;
        int pos = num/2;
        if(num%2==0){
            for(int i=0; i<num; i++){
                answer[i] = mid+i-pos+1;
            }
        }else{
            for(int i=0; i<num; i++){
                answer[i] = mid+i-pos;
            }
        }
        return answer;
    }
}
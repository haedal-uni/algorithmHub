class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] num = new int[1000];
        int count = 0;
        for(int i=0; i<array.length; i++){
            num[array[i]]++;
            if(count<num[array[i]]){
                answer = array[i];
                count = num[array[i]];
            } else if(count == num[array[i]]){
                answer = -1;
            }
        }
        return answer;
    }
}
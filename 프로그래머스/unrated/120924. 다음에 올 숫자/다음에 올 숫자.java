class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num1 = common[common.length-1];
        int num2 = common[common.length-2];
        int num3 = common[common.length-3];
        if(num1 !=0 && num2 !=0 && num3 != 0){
            if(num1%num2==0 && num2%num3==0 && num2/num3==num1/num2){
                answer = num1 * num1/num2;
            }else{
                answer = num1 + num1 - num2;
            }
        }else{
            answer = num1 + num1 - num2;
        }
        return answer;
    }
}
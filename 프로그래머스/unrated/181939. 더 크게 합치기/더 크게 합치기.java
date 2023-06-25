class Solution {
    public int solution(int a, int b) {
        String aw = String.valueOf(a);
        String bw = String.valueOf(b);
        String num1 = aw + bw;
        String num2 = bw + aw;
        int num = Integer.parseInt(num1);
        int numm = Integer.parseInt(num2);
        if(num >= numm){
            return num;
        }else{
            return numm;
        }
    }
}
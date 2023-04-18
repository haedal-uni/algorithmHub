class Solution {
    public int solution(int num, int k) {
        String num1 = String.valueOf(num);
        String k1 = String.valueOf(k);
        if(!num1.contains(k1)){
            return -1;
        }else{
            return num1.indexOf(k1)+1;
        }
    }
}
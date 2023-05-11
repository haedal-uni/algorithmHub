class Solution {
    public String solution(int a, int b) {
        String[] day = {"THU", "FRI","SAT","SUN","MON","TUE","WED"};
        int[] array = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for(int i=0; i<a-1; i++){
            sum +=array[i];
        }
        sum+=b;
        return day[sum%7];
    }
}
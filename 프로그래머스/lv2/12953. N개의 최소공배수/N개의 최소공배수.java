import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        answer = b(arr[0], arr[1]);
        for(int i=2; i<arr.length; i++){
            answer = b(answer, arr[i]);
        }
        return answer;
    }
    public int a(int num1, int num2){
        if(num1%num2==0){
            return num2;
        }
        return a(num2, num1%num2);
    }
    public int b(int num1, int num2){
        return num1*num2/a(num1, num2);
    }
}
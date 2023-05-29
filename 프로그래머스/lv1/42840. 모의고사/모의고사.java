import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer;
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0; i<answers.length; i++){
            if(num1[i%num1.length]==answers[i]){
                count1++;
            }
            if(num2[i%num2.length]==answers[i]){
                count2++;
            }
            if(num3[i%num3.length]==answers[i]){
                count3++;
            }
        }
        int[] ans = {count1, count2, count3};
        int[] nums = {count1, count2, count3};
        int num = 0;
        Arrays.sort(ans);        
        if(ans[2]!=ans[0] && ans[2]==ans[1]){
            answer = new int[2];
        }else if(ans[2]==ans[1] && ans[2]==ans[0]){
            answer = new int[3];
        }else{
            answer = new int[1];
        }
        for(int i=0; i<ans.length; i++){
            if(ans[2] == nums[i]){
                answer[num] = i+1;
                num++;
            }
        }
        return answer;
    }
}
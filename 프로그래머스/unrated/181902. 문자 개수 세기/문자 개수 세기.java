class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int num = 0;
        int count = 0;
        String[] ans = my_string.split("");
        for(int i=0; i<ans.length; i++){
            count = (int) ans[i].charAt(0);
            if(count>96){
                num = answer[count-71];
                answer[count-71] = num+1;
            }else{
                num = answer[count-65];
                answer[count-65] = num+1;
            }
        }
        return answer;
    }
}
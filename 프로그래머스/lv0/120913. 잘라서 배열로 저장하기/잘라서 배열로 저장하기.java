class Solution {
    public String[] solution(String my_str, int n) {
        int count = 0;
        if(my_str.length()%n!=0){
            count = 1;
        }
        String[] answer = new String[(my_str.length()/n)+count];
        String ans = "";
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_str.length(); i++){
            ans += my_str.split("")[i];
            if((1+i)%n==0){
                answer[num] = ans;
                ans = "";
                num++;
            } else if((num+1)==answer.length){
                answer[num] = ans;
            }
        }
        return answer;
    }
}
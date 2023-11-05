class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String[] ans = my_string.split("");
        int cnt = 0;
        for(int i=0; i<ans.length; i++){            
            if((int) ans[i].charAt(0) < 65) {
                sb.append(ans[i]);
                cnt = 1;
            }else{
                if(cnt == 1 && i!=ans.length-1){
                    sb.append("+");
                    cnt = 0;
                }
            }
        }
        String h = sb.toString().replace("+", " ");
        if(h.length()!=0){
            String[] num = h.split(" ");
            for(int i=0; i<num.length; i++){
                answer+= Integer.parseInt(num[i]);
            }
        }
        return answer;
    }
}
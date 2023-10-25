class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int num = 0;
        int count = 0;
        String[] ans = myString.split("");
        String[] pat1 = pat.split("");
        for(int i=0; i<ans.length; i++){
            if(ans[i].equals(pat1[0])){
                count = 0;
                num = i+1;
                if(pat1.length<=ans.length-i){
                    for(int j=1; j<pat1.length; j++){
                        if(!ans[num].equals(pat1[j])){
                            break;
                        }
                        num++;
                        count++;
                        if(count+1==pat1.length){
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s=s.toLowerCase();
        int count=0;
        for(int i=0; i<s.length(); i++){
            switch(s.split("")[i]){
                case "y":
                    count++;
                    break;
                case "p":
                    count--;
                    break;
            }
        }
        if(count!=0){
            answer = false;
        }
        return answer;
    }
}
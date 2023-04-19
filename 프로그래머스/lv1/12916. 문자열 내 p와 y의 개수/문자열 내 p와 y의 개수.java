class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count=0;
        int num=0;
        for(int i=0; i<s.length(); i++){
            switch(s.split("")[i]){
                case "Y":
                case "y":
                    count++;
                    break;
                case "p":
                case "P":
                    num++;
                    break;
            }
        }
        if(count!=num){
            answer = false;
        }
        return answer;
    }
}
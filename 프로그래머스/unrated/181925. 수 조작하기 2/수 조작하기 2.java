import java.lang.*;
class Solution {
    public String solution(int[] numLog) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numLog.length-1; i++){
            answer = numLog[i+1] - numLog[i];
            switch(answer){
                case 1:
                    sb.append("w");
                    break;
                case -1 :
                    sb.append("s");
                    break;
                case 10 :
                    sb.append("d");
                    break;
                case -10 :
                    sb.append("a");
                    break;
            }
        }
        return sb.toString();
    }
}
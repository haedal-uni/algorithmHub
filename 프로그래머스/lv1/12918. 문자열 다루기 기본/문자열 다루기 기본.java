import java.io.*;
import java.lang.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            try{
                Integer.valueOf(s);  
            }catch(Exception e){
                answer = false;
            }
        }else{
            answer = false;
        }
        return answer;
    }
}
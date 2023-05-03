import java.util.*;
import java.io.*;
class Solution {
    public int solution(String binomial) throws IOException  {
        StringTokenizer st = new StringTokenizer(binomial, " ");
        int a = Integer.parseInt(st.nextToken());
        String x = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        if(x.equals("+")){
            return a+b;
        }else if(x.equals("-")){
            return a-b;
        }else{
            return a*b;
        }
    
    }
}
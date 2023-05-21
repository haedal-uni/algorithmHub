import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if(n%2==0){
            sb.append(n).append(" is ").append("even");
        }else{
            sb.append(n).append(" is ").append("odd");
        }
        System.out.println(sb.toString());
    }
}
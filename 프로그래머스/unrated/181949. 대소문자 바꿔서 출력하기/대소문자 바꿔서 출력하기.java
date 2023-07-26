import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String a = st.nextToken();
        String b = "";
        for(int i=0; i<a.length(); i++){
            b = a.split("")[i];
            if((int) b.charAt(0) > 96){
                sb.append(b.toUpperCase());
            }else{
                sb.append(b.toLowerCase());
            }
        }
        System.out.println(sb.toString());
    }
}
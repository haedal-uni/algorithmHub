import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n).repeat(Math.max(0, n)));
        if(sb.length()>m){
            System.out.print(sb.substring(0,m));
        }else{
            System.out.print(sb);
        }
    }
}
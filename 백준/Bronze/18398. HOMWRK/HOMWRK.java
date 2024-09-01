import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = 0;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int x = 0;
        int y = 0;
        for(int i=0; i<t; i++){
            n = Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y=Integer.parseInt(st.nextToken());
                sb.append(x+y).append(" ").append(x*y).append("\n");
            }
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = 0;
        int u = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            u = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            sb.append(t*2-u).append(" ").append(t-(t*2-u)).append("\n");
        }
        System.out.println(sb);
    }
}
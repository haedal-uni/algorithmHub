import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append("You get ").append(a/b).append(" piece(s) and your dad gets ").append(a%b).append(" piece(s).").append("\n");
        }
        System.out.println(sb);
    }
}
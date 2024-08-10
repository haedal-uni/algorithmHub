import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int x = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
            sb.append(x/2).append("\n");
        }
        System.out.println(sb);
    }
}
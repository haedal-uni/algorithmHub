import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int sum =0;
        int x = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            sum+=Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            sum+=x/4-x/7;
            sb.append(sum).append("\n");
            sum = 0;
        }
        System.out.println(sb);
    }
}
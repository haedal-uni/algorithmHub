import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st;
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            sum+=Integer.parseInt(st.nextToken());
            sum+=Integer.parseInt(st.nextToken());
            sb.append(sum).append("\n");
            sum=0;
        }
        System.out.println(sb);
    }
}
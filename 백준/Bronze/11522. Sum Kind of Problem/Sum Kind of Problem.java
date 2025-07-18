import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = 0;
        int sum;
        int odd;
        int even;
        for(int i=0; i<k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken()).append(" ");
            n = Integer.parseInt(st.nextToken());
            sum = n*(n+1)/2;
            odd = n*n;
            even = n*(n+1);
            sb.append(sum).append(" ").append(odd).append(" ").append(even).append("\n");
        }
        System.out.print(sb);
    }
}
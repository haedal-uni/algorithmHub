import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int opt = 0;
        int sum = 0;
        int q = 0;
        int p = 0;
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(br.readLine());
            opt = Integer.parseInt(br.readLine());
            for(int j=0; j<opt; j++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                q = Integer.parseInt(st.nextToken());
                p = Integer.parseInt(st.nextToken());
                sum+=p*q;
            }
            sb.append(sum).append("\n");
            sum = 0;
        }
        System.out.println(sb);
    }
}
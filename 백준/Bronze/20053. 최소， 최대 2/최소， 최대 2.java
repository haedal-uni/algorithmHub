import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int a = 0;
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                a = Integer.parseInt(st.nextToken());
                if(a<min) min = a;
                if(a>max) max = a;
            }
            sb.append(min).append(" ").append(max).append("\n");
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
        System.out.print(sb);
    }
}
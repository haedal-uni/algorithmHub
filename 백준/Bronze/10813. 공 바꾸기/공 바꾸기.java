import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] x = new int[n];
        int a,b,c = 0;
        for(int i=1; i<n+1; i++){
            x[i-1] = i;
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            c = x[a-1];
            x[a-1] = x[b-1];
            x[b-1] = c;
        }
        for(int i=0; i<x.length; i++){
            sb.append(x[i]).append(" ");
        }
        System.out.println(sb);
    }
}
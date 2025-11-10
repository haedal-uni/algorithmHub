import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i=0; i<m; i++) {
            String[] x = br.readLine().split("");
            for(int j=0; j<n; j++) {
                ss.append(x[j].repeat(k));
            }
            ss.append("\n");
            sb.append(ss.toString().repeat(k));
            ss.delete(0, ss.length());
        }
        System.out.print(sb);
    }
}
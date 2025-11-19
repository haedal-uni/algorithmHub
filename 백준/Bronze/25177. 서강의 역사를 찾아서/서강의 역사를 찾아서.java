import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] x = br.readLine().split(" ");
        String[] y = br.readLine().split(" ");
        int len = Math.max(N, M);
        int z = 0;
        for (int i=0; i<len; i++) {
            int a=0;
            int b=0;
            if (i<N) {
                a = Integer.parseInt(x[i]);
            }
            if (i<M) {
                b = Integer.parseInt(y[i]);
            }
            int c = b-a;
            if (c>z) {
                z = c;
            }
        }
        System.out.print(z);
    }
}
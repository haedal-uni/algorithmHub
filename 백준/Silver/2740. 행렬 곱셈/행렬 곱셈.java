import java.io.*;
import java.util.*;
public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] b = new int[m][k];
        int[][] c = new int[n][k];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<k; j++){
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<n; i++) {
            for (int j=0; j<k; j++) {
                for (int z=0; z<m; z++) {
                    c[i][j]+=a[i][z] * b[z][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                sb.append(c[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
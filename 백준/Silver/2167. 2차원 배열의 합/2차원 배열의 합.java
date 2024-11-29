import java.io.*;
import java.util.*;
public class Main {
    public static Deque<Integer> deque = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int sum = 0;
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        k = Integer.parseInt(br.readLine());
        for(int i=0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken())-1;
            b = Integer.parseInt(st.nextToken())-1;
            c = Integer.parseInt(st.nextToken())-1;
            d = Integer.parseInt(st.nextToken())-1;
            for(int j=a; j<c+1; j++) {
                for(int z=b; z<d+1; z++) {
                    sum+=arr[j][z];
                }
            }
            sb.append(sum).append("\n");
            sum=0;
        }
        System.out.print(sb);
    }
}
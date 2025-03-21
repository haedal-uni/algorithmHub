import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 0;
        int[] arr = new int[n+1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<n+1; i++) {
            max+=Integer.parseInt(st.nextToken());
            arr[i]=max;
        }
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(arr[b]-arr[a-1]).append("\n");
        }
        System.out.print(sb);
    }
}
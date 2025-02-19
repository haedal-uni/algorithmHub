import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())]++;
            arr[Integer.parseInt(st.nextToken())]++;
        }
        for(int i=1; i<n+1; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int min;
        int num;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            min = Integer.MAX_VALUE;
            num = 0;
            if(n == 0) break;
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
                arr[i] = Math.abs(Integer.parseInt(st.nextToken())-2023);
            }
            for(int i=0; i<n; i++) {
                if(arr[i] < min) {
                    num = i+1;
                    min = arr[i];
                }
            }
            sb.append(num).append("\n");
        }
        System.out.print(sb);
    }
}
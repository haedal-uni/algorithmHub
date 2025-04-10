import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[4];
        int sum=0;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<4; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i]==0) sum++;
            }
            if(sum==4) break;
            sb.append(arr[2]-arr[1]).append(" ").append(arr[3]-arr[0]).append("\n");
            sum=0;
        }
        System.out.print(sb);
    }
}
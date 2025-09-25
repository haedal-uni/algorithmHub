import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        float sum = 0;
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            for(int j=0; j<x; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                sum += Integer.parseInt(st.nextToken())*Float.parseFloat(st.nextToken());
            }
            sb.append("$").append(String.format("%.2f", sum)).append("\n");
            sum = 0;
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<x; j++){
                sum += Integer.parseInt(st.nextToken());
            }
            sb.append(sum).append("\n");
            sum=0;
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int x = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            x=st.countTokens();
            for(int j=0; j<x; j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            sb.append(sum).append("\n");
            sum=0;
        }
        System.out.println(sb);
    }
}
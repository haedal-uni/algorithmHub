import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n==0){
                break;
            }
            sum=Integer.parseInt(st.nextToken())-Integer.parseInt(st.nextToken());
            for(int i=0; i<n-1; i++){
               sum*=Integer.parseInt(st.nextToken());
               sum-=Integer.parseInt(st.nextToken());
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int sum = 0;
        for(int i=0; i<n; i++) {
            x = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum=0;
            for(int j=0; j<x; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if(sum>0){
                sb.append("Right").append("\n");
            }else if(sum==0){
                sb.append("Equilibrium").append("\n");
            }else{
                sb.append("Left").append("\n");
            }
        }
        System.out.print(sb);
    }
}

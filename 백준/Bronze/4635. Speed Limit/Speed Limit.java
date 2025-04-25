import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 0;
        int s = 0;
        int t = 0;
        int count = 0;
        int a = 0;
        while (true){
            n = Integer.parseInt(br.readLine());
            a = 0;
            count = 0;
            if(n==-1){
                break;
            }
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                s = Integer.parseInt(st.nextToken());
                t = Integer.parseInt(st.nextToken());
                count+=s*(t-a);
                a=t;
            }
            sb.append(count).append(" miles").append("\n");
        }
        System.out.print(sb);
    }
}
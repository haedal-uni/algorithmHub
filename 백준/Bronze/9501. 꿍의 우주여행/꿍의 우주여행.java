import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int count = 0;
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken());
                float f = Integer.parseInt(st.nextToken());
                float c = Integer.parseInt(st.nextToken());
                if(d-v*(f/c)<=0){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int n = 0;
        int d = 0;
        int v = 0;
        float f = 0.0f;
        float c = 0.0f;
        int count = 0;
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            count = 0;
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                v = Integer.parseInt(st.nextToken());
                f = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());
                if(d-v*(f/c)<=0){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
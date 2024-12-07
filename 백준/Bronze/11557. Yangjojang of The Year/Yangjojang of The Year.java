import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int n = 0;
        int max = 0;
        int num = 0;
        for(int i=0; i<t; i++){
            n=Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                x.append(st.nextToken());
                num = Integer.parseInt(st.nextToken());
                if(max<num){
                    max=num;
                    y.delete(0, y.length());
                    y.append(x);
                }
                x.delete(0, x.length());
            }
            sb.append(y).append("\n");
            max=0;
        }
        System.out.print(sb);
    }
}
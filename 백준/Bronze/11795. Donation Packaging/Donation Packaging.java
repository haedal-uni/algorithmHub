import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;
        int x = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            a+=Integer.parseInt(st.nextToken());
            b+=Integer.parseInt(st.nextToken());
            c+=Integer.parseInt(st.nextToken());
            x = Math.min(a,Math.min(b,c));
            if(x>=30){
                sb.append(x).append("\n");
                a-=x;
                b-=x;
                c-=x;
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
}
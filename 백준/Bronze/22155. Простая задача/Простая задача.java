import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if ((a<=1 && b<=2) || (a<=2 && b<=1)) {
                sb.append("Yes\n");
            }else{
                sb.append("No\n");
            }
        }
        System.out.print(sb);
    }
}
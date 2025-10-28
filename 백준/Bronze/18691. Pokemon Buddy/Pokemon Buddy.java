import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(c<=b){
                sb.append("0").append("\n");
            }else{
                if(a==2) a=3;
                else if(a==3) a=5;
                sb.append((c-b)*a).append("\n");
            }
        }
        System.out.print(sb);
    }
}
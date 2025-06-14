import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=1; i<n+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            sb.append("Case ").append(i).append(": ");
            if(st.nextToken().equals("+")){
                x+=Integer.parseInt(st.nextToken());
            }else{
                x-=Integer.parseInt(st.nextToken());
            }
            st.nextToken();
            if(x==Integer.parseInt(st.nextToken())){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}
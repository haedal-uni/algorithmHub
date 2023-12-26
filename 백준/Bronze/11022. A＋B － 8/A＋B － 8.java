import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int a, b = 0;
        for (int i=1; i<num+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(i==num){
                sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b);
            }else{
                sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
            }
        }
        System.out.print(sb);
    }
}
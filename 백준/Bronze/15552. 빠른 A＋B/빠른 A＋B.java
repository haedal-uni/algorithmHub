import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for (int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(i==num-1){
                sb.append(a+b);
            }else{
                sb.append(a+b).append("\n");
            }
        }
        System.out.print(sb);
    }
}
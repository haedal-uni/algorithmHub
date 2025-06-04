import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a1;
        int a2;
        int a3;
        int a4;
        int count;
        while (true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0 && d==0){
                break;
            }
            if (a==b && b==c && c==d) {
                sb.append("0\n");
                continue;
            }
            count=0;
            while (true){
                a1 = Math.abs(a-b);
                a2 = Math.abs(b-c);
                a3 = Math.abs(c-d);
                a4 = Math.abs(d-a);
                count++;
                if(a1==a2 && a2==a3 && a3==a4){
                    break;
                }
                a=a1;
                b=a2;
                c=a3;
                d=a4;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}

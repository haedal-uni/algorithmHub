import java.io.*;
import java.util.*;
public class Main {
    public static Deque<Integer> deque = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        while (true){
            st = new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }
            if(a>b){
                sb.append("Yes").append("\n");
            }else{
                sb.append("No").append("\n");
            }
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sb.append(x(a,b)).append("\n").append(y(a,b));
        System.out.println(sb);
    }
    public static int x(int a, int b){
        if(a%b==0){
            return b;
        }
        return x(b, a%b);
    }
    public static int y(int a, int b){
        return a*b/x(a,b);
    }
}
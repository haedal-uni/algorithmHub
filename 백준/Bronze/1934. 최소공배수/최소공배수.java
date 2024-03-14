import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append(y(a,b)).append("\n");
        }
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
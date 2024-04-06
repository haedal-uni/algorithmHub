import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        long a = 0;
        long b = 0;
        for(int i=0; i<x; i++){
            st = new StringTokenizer(br.readLine()," ");
            a = Long.parseLong(st.nextToken());
            b = Long.parseLong(st.nextToken());
            sb.append(a*b/a(a,b)).append("\n");
        }
        System.out.println(sb);
    }
    public static long a(long x, long y){
        if(x%y==0){
            return y;
        }
        return a(y, x%y);
    }
}
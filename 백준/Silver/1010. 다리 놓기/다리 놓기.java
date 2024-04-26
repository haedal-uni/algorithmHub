import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            if(a>b){
                c = Math.min(b, a-b);
                sb.append(f(a, c)/ff(c)).append("\n");
            }else{
                if(b-a==0){
                    sb.append(1).append("\n");
                }else{
                    c = Math.min(a, b-a);
                    sb.append(f(b, c) / ff(c)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
    public static long ff(int x){
        long z = 1;
        if(x<3){
            return x;
        }else{
            for(int i=2; i<x+1;i++){
                z*=i;
            }
        }
        return z;
    }
    public static long f(int x, int y){
        long z = 1;
        if(x<3){
            return x;
        }else{
            for(int i=x; y>0; i--){
                z*=i;
                y--;
            }
        }
        return z;
    }
}
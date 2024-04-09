import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        System.out.println(x*y/a(x,y));
    }
    public static long a(long x, long y){
        if(x%y==0){
            return y;
        }
        return a(y,x%y);
    }
}
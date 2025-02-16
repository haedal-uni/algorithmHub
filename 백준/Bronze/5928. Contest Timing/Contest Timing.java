import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = (d*24*60)+ (h*60) + m - (11*24*60+11*60+11);
        if(x<0){
            System.out.print(-1);
        }else{
            System.out.print(x);
        }
    }
}
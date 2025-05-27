import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(min>(Math.abs(a-x)+Math.abs(b-y))){
                c=a;
                d=b;
                min=Math.abs(a-x)+Math.abs(b-y);
            }
        }
        System.out.print(c + " "+ d);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int max = 0;
        int x = 0;
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x-=Integer.parseInt(st.nextToken());
            x+=Integer.parseInt(st.nextToken());
            if(max<x){
                max=x;
            }
        }
        System.out.print(max);
    }
}
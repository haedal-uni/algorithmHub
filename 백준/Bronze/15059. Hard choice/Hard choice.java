import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int x = 0;
        int sum = 0;
        st = new StringTokenizer(br.readLine()," ");
        x = Integer.parseInt(st.nextToken());
        if(a<x){
            sum+=x-a;
        }
        x = Integer.parseInt(st.nextToken());
        if(b<x){
            sum+=x-b;
        }
        x = Integer.parseInt(st.nextToken());
        if(c<x){
            sum+=x-c;
        }
        System.out.println(sum);
    }
}
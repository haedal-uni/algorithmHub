import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] x = new int[Integer.parseInt(st.nextToken())];
        int y = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int a=0;
        int b=0;
        int c=0;
        for(int i=0; i<y; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            for(int j=a-1; j<b; j++){
                x[j] = c;
            }
        }
        for(int i=0; i<x.length; i++){
            sb.append(x[i]).append(" ");
        }
        System.out.println(sb);
    }
}
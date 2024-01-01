import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = 0;
        String[] a = br.readLine().split(" ");
        for (int i=0; i<x; i++){
            z = Integer.parseInt(a[i]);
            if(y>z){
                sb.append(z).append(" ");
            }
        }
        System.out.print(sb);
    }
}
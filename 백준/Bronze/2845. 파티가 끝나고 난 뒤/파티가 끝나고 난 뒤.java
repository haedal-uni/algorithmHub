import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = n*m;
        String[] p = br.readLine().split(" ");
        for(int i=0; i<5; i++){
            sb.append(Integer.parseInt(p[i])-x).append(" ");
        }
        System.out.println(sb);
    }
}
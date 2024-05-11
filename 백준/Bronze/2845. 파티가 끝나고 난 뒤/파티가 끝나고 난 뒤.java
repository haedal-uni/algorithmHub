import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        String[] p = br.readLine().split(" ");
        for(int i=0; i<5; i++){
            sb.append(Integer.parseInt(p[i])-x).append(" ");
        }
        System.out.println(sb);
    }
}
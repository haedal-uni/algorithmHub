import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder x = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            x.append(br.readLine()).reverse();
            sb.append(x).append("\n");
            x.delete(0,x.length());
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            sb.append(x.replace(x.substring(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())), "")).append("\n");
        }
        System.out.print(sb);
    }
}
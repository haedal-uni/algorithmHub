import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        int c = 0;
        int x = 0;
        double y = 0.0;
        double z = 0.0;
        for(int i=0; i<n; i++){
            m = Integer.parseInt(br.readLine());
            for(int j=0; j<m;j++){
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Double.parseDouble(st.nextToken());
                z += x*y;
                c+=x;
            }
            sb.append(c).append(" ").append(z/c).append("\n");
            c = 0;
            z = 0;
        }
        System.out.println(sb);
    }
}
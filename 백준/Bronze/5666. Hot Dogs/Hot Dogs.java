import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int x = 0;
        int y = 0;
        float z = 0;
        while (true) {
            String line = br.readLine();
            if(line == null) break;
            st = new StringTokenizer(line);
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = (float) x/y;
            sb.append(String.format("%.2f\n", z));
        }
        System.out.print(sb);
    }
}

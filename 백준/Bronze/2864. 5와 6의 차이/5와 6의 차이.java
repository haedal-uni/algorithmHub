import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int min = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String x = st.nextToken();
        String y = st.nextToken();
        max = Integer.parseInt(x.replaceAll("5","6")) + Integer.parseInt(y.replaceAll("5","6"));
        min = Integer.parseInt(x.replaceAll("6","5")) + Integer.parseInt(y.replaceAll("6","5"));
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
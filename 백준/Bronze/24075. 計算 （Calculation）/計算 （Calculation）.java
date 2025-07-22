import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(a+b, a-b)).append("\n");
        sb.append(Math.min(a+b, a-b));
        System.out.print(sb);
    }
}
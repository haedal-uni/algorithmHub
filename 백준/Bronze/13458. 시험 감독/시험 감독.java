import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long count = Long.parseLong(br.readLine());
        String[] x = br.readLine().split(" ");
        long y = 0L;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        for (String s : x) {
            y = Long.parseLong(s) - b;
            if (y > 0) {
                count += y / c;
                if (y % c != 0) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
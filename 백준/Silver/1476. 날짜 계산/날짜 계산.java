import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = 1;
        int y = 1;
        int z = 1;
        int i = 1;
        while (x != e || y != s || z != m) {
            x += 1;
            y += 1;
            z += 1;
            i += 1;
            if (x == 16) {
                x = 1;
            }
            if (y == 29) {
                y = 1;
            }
            if (z == 20) {
                z = 1;
            }

        }
        System.out.println(i);
    }
}
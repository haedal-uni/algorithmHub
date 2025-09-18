import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d_s = Integer.parseInt(st.nextToken());
        int y_s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int d_m = Integer.parseInt(st.nextToken());
        int y_m = Integer.parseInt(st.nextToken());

        for (int x=1; x<=5000; x++) {
            if ((x+d_s) % y_s == 0 && (x+d_m) % y_m == 0) {
                System.out.print(x);
                break;
            }
        }
    }
}
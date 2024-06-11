import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = 1;
        int y = 1;
        int sum = 0;
        while (y <= b) {
            for (int i = 0; i < x; i++) {
                if (y >= a && y <= b) {
                    sum += x;
                } else if (y > b) {
                    break;
                }
                y++;
            }
            x++;
        }
        System.out.println(sum);
    }
}
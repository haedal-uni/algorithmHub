import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        for (int i = 2; i < Math.sqrt(x) + 1; i++) {
            while (x % i == 0) {
                sb.append(i).append("\n");
                x /= i;
            }
        }
        if (x != 1) {
            sb.append(x);
        }
        System.out.println(sb);
    }
}
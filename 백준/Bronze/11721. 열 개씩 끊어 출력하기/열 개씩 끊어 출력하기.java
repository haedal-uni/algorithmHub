import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (String s : x) {
            sb.append(s);
            n++;
            if (n == 10) {
                n = 0;
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
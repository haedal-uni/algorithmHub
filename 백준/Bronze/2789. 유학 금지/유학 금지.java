import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (String s : x) {
            n = s.charAt(0);
            if (n > 69 && n != 71 && n != 73 && n != 77 && n != 82) {
                sb.append(s);
            }
        }
        System.out.print(sb);
    }
}
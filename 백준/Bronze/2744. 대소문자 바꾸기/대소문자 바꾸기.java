import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        StringBuilder sb= new StringBuilder();
        for (String x:s) {
            if ((int) x.charAt(0)>96) {
                sb.append(x.toUpperCase());
            } else {
                sb.append(x.toLowerCase());
            }
        }
        System.out.println(sb);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String x = br.readLine();
            if (x.equals("*")) {
                break;
            }
            String[] y = x.trim().split("\\s+");
            char c = Character.toLowerCase(y[0].charAt(0));
            boolean flag = true;
            for (int i=1; i<y.length; i++) {
                if (Character.toLowerCase(y[i].charAt(0)) != c) {
                    flag = false;
                    break;
                }
            }
            sb.append(flag ? "Y" : "N").append("\n");
        }
        System.out.print(sb);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String[] x = br.readLine().split("");
            String[] y = br.readLine().split("");
            for (String s : x) {
                if (s.charAt(0) == 32) {
                    sb.append(" ");
                } else {
                    sb.append(y[s.charAt(0) - 65]);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
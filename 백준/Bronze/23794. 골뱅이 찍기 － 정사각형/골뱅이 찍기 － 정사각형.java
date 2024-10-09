import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String x = "@";
        sb.append(x.repeat(n+2)).append("\n");
        for(int i=0;i<=n-1;i++){
            sb.append("@").append(" ".repeat(n)).append("@").append("\n");
        }
        sb.append(x.repeat(n+2));
        System.out.println(sb);
    }
}
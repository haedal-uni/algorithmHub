import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        x.append("@@@@@".repeat(n)).append("\n");
        sb.append(String.valueOf(x).repeat(n));
        y.append("@".repeat(n)).append("\n");
        sb.append(String.valueOf(y).repeat(n));
        sb.append(sb);
        sb.append(String.valueOf(y).repeat(n));
        System.out.print(sb);
    }
}
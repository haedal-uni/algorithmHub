import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        x.append("@@@@@".repeat(n)).append("\n");
        sb.append(x.toString().repeat(n));
        y.append("@".repeat(n)).append("\n");
        sb.append(y.toString().repeat(n));
        sb.append(sb);
        sb.append(y.toString().repeat(n));
        System.out.print(sb);
    }
}
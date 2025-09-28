import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = (2*n)-1;
        for(int i=0; i<n; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(m-2*i)).append("\n");
        }
        System.out.print(sb);
    }
}
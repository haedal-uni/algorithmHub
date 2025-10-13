import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append(" ".repeat(n-1)).append("*").append("\n");
        for(int i=1; i<n; i++){
            sb.append(" ".repeat(n-i-1));
            sb.append("*");
            sb.append(" ".repeat(2*i-1));
            sb.append("*").append("\n");
        }
        System.out.print(sb);
    }
}
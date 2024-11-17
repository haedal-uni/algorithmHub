import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        for(int i=0; i<r; i++) {
            sb.append("*".repeat(c)).append("\n");
        }
        System.out.print(sb);
    }
}
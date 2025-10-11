import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            sb.append("++++ ".repeat(x/5));
            sb.append("|".repeat(x%5)).append("\n");
        }
        System.out.print(sb);
    }
}
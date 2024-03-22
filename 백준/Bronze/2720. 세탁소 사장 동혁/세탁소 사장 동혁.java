import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            sb.append(x/25).append(" ");
            count = x%25;
            sb.append(count/10).append(" ");
            count = count%10;
            sb.append(count/5).append(" ");
            count = count%5;
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
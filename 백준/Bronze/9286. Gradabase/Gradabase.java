import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        int x = 0;
        for(int i=0; i<n; i++){
            sb.append("Case ").append(i+1).append(": ").append("\n");
            m = Integer.parseInt(br.readLine());
            for(int j=0; j<m; j++) {
                x = Integer.parseInt(br.readLine());
                if (x != 6) {
                    sb.append(x + 1).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
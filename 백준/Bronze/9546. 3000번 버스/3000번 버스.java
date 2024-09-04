import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            sb.append((int) Math.pow(2,x)-1).append("\n");
        }
        System.out.println(sb);
    }
}
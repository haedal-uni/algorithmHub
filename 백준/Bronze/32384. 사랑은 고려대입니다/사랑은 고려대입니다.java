import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append("LoveisKoreaUniversity");
            if(i != n-1) {
                sb.append(" ");
            }
        }
        System.out.print(sb);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum+= (int) Math.pow(i,3);
        }
        System.out.print(sum);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] x = br.readLine().split("");
        for(int i=0; i<n; i++){
            sum+=x[i].charAt(0)-64;
        }
        System.out.print(sum);
    }
}
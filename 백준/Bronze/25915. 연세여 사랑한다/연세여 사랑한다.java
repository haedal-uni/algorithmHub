import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = "ILOVEYONSEI".split("");
        int n = br.readLine().charAt(0);
        int sum = 0;
        for (String s : x) {
            n -= s.charAt(0);
            sum += Math.abs(n);
            n = s.charAt(0);
        }
        System.out.print(sum);
    }
}
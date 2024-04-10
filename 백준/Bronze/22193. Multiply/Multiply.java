import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        BigInteger x = new BigInteger(br.readLine());
        BigInteger y = new BigInteger(br.readLine());
        System.out.println(x.multiply(y));
    }
}
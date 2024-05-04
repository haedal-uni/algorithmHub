import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigInteger x = new BigInteger(st.nextToken());
        BigInteger y = new BigInteger(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(x.divide(y)).append("\n").append(x.remainder(y));
        System.out.println(sb);
    }
}
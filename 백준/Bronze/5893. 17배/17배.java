import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine(), 2);
        Stack<BigInteger> stack = new Stack<>();
        n = n.multiply(BigInteger.valueOf(17));
        while(true) {
            stack.push(n.remainder(BigInteger.valueOf(2)));
            n = n.divide(BigInteger.valueOf(2));
            if(n.equals(BigInteger.ONE)) {
                stack.push(n);
                break;
            }
        }
        while(!stack.isEmpty()) {
            BigInteger s = stack.pop();
            System.out.print(s);
        }
    }
}
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger b = new BigInteger("1");
        int count = 0;
        if(n>1){
            for(int i=2;i<n+1;i++){
                b = b.multiply(BigInteger.valueOf(i));
                while (b.remainder(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0))){
                    b = b.divide(BigInteger.valueOf(10));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
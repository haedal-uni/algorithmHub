import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        BigInteger a;
        BigInteger b = new BigInteger("2");
        BigInteger c = new BigInteger("0");
        for(int i=0; i<n; i++){
            a = new BigInteger(br.readLine());
            if(a.remainder(b).compareTo(c)==0){
                sb.append("even").append("\n");
            }else{
                sb.append("odd").append("\n");
            }
        }
        System.out.println(sb);
    }
}
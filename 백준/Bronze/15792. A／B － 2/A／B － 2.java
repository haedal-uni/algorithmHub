import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());
        MathContext mc = new MathContext(2100);
        BigDecimal x = a.divide(b, mc);
        String s = x.toPlainString();
        if (s.contains(".")) {
            int idx = s.indexOf(".");
            int decimals = s.length()-idx-1;
            if (decimals > 2000) {
                s = s.substring(0, idx + 2001);
            }
        }
        System.out.print(s);
    }
}
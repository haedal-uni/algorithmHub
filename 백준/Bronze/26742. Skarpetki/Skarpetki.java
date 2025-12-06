import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int a = 0;
        int b = 0;
        for (String s : x) {
            if (s.equals("B")) {
                a++;
            } else {
                b++;
            }
        }
        System.out.print(a/2 + b/2);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int a = 0;
        int b = 0;
        for (String s : x) {
            if (s.equals("A")) {
                a++;
            } else {
                b++;
            }
        }
        System.out.print(a+" : "+b);
    }
}
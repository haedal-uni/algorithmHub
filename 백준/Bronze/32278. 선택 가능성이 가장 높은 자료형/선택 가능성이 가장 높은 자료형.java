import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());
        if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {
            System.out.print("short");
        } else if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
            System.out.print("int");
        } else {
            System.out.print("long long");
        }
    }
}
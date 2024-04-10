import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        long x = Long.parseLong(br.readLine());
        long y = Long.parseLong(br.readLine());
        System.out.println(x*y);
    }
}
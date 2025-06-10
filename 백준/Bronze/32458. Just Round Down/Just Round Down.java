import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print((int) Math.floor(Float.parseFloat(br.readLine())));
    }
}
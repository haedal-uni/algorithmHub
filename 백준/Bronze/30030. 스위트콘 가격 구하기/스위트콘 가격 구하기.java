import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Integer.parseInt(br.readLine())/1.1;
        double floor = Math.round(n);
        System.out.println((int) floor);
    }
}
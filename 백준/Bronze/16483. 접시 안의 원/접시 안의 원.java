import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = (double) Integer.parseInt(br.readLine()) /2;
        System.out.println((int) Math.floor(Math.pow(x,2)));
    }
}
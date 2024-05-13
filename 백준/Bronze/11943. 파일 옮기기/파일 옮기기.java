import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int x = Integer.parseInt(a[0])+Integer.parseInt(b[1]);
        int y = Integer.parseInt(a[1])+Integer.parseInt(b[0]);
        System.out.println(Math.min(x, y));
    }
}
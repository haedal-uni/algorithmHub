import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        n-=Integer.parseInt(br.readLine());
        n+=Integer.parseInt(br.readLine());
        System.out.println(n);
    }
}
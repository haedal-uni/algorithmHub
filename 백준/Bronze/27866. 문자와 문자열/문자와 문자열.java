import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int y = Integer.parseInt(br.readLine());
        System.out.println(x.split("")[y-1]);
    }
}
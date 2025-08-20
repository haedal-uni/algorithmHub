import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        String y = br.readLine();
        for(String s:x) {
            y = y.replaceAll(s, "");
        }
        System.out.print(y);
    }
}
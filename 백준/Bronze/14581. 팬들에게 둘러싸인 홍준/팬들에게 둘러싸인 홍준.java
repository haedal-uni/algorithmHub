import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = ":fan::fan::fan:" + "\n" +
                ":fan::" + br.readLine() + "::fan:" + "\n" +
                ":fan::fan::fan:";
        System.out.print(s);
    }
}
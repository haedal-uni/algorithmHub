import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String y = br.readLine();
        int count = 0;
        while (x.length() != x.replace(y, "").length() && !x.isEmpty()) {
            x = x.replaceFirst(y, "1");
            count++;
        }
        System.out.print(count);
    }
}
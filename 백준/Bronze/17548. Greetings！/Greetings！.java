import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        System.out.print("h" + "e".repeat((x.length()-2)*2)+"y");
    }
}
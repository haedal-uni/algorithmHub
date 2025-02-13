import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x= br.readLine();
        String y = x.replaceAll("DKSH","");
        System.out.print((x.length()-y.length())/4);
    }
}
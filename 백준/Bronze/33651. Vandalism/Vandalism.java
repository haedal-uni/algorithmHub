import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split("");
        String x = "UAPC";
        for (String string : s) {
            x = x.replace(string, "");
        }
        System.out.print(x);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = {
                "baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu",
                "in", "bed", "tururu", "turu", "baby", "sukhwan"
        };
        int n = Integer.parseInt(br.readLine())-1;
        int a = n/14;
        int b = n%14;
        String s = x[b];
        if (s.equals("tururu")) {
            int count = 2 + a;
            if (count >= 5) {
                System.out.print("tu+ru*" + count);
            } else {
                System.out.print("tu" + "ru".repeat(count));
            }
        } else if (s.equals("turu")) {
            int count = 1 + a;
            if (count >= 5) {
                System.out.print("tu+ru*" + count);
            } else {
                System.out.print("tu" + "ru".repeat(count));
            }
        } else {
            System.out.print(s);
        }
    }
}
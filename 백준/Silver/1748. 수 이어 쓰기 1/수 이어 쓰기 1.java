import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i < 10) {
                sum += 1;
            } else if (i <= 99) {
                sum += 2;
            } else if (i <= 999) {
                sum += 3;
            } else if (i <= 9999) {
                sum += 4;
            } else if (i <= 99999) {
                sum += 5;
            } else if (i <= 999999) {
                sum += 6;
            } else if (i <= 9999999) {
                sum += 7;
            } else if (i <= 99999999) {
                sum += 8;
            } else if (i <= 999999999) {
                sum += 9;
            }
        }
        System.out.println(sum);
    }
}
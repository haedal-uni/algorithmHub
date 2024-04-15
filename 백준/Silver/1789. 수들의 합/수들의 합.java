import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());
        long i = 0;
        long sum = 0;
        while (x >= sum) {
            i++;
            sum += i;
        }
        if (sum > x) {
            System.out.println(i - 1);
        } else {
            System.out.println(i);
        }
    }
}
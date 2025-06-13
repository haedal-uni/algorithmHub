import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" ");
        int sum = 0;
        for (String s : x) {
            if (s.equals("1")) {
                sum += 500;
            } else if (s.equals("2")) {
                sum += 800;
            } else {
                sum += 1000;
            }
        }
        System.out.print(5000-sum);
    }
}
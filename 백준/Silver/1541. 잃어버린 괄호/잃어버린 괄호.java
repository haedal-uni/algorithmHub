import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;
        int sum = 0;
        String[] a = br.readLine().split("-");;
        String[] b;
        for (int i = 0; i < a.length; i++) {
            b = a[i].split("\\+");
            for (int j = 0; j < b.length; j++) {
                if (j == 0) {
                    x += Integer.parseInt(b[j]);
                } else {
                    y += Integer.parseInt(b[j]);
                }
            }
            if (i == 0) {
                sum += x + y;
            } else {
                sum += Math.min(-x + y, -(x + y));
            }
            x = 0;
            y = 0;
        }
        System.out.println(sum);
    }
}
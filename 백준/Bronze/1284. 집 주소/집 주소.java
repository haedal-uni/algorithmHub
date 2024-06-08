import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String x = br.readLine();
            int sum = 1;
            if (x.equals("0")) {
                break;
            }
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '1') {
                    sum += 3;
                } else if (x.charAt(i) == '0') {
                    sum += 5;
                } else {
                    sum += 4;
                }
            }
            System.out.println(sum);
        }
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            }
            int n = Integer.parseInt(s);
            String[] x = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(x[i]);
            }
            int max = 0;
            for (int i=0; i<n; i++) {
                int sum = 0;
                if (i>=2) {
                    sum+= arr[i-2];
                }
                if (i>=1) {
                    sum+= arr[i-1];
                }
                sum+= arr[i];
                max= Math.max(max, sum);
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}

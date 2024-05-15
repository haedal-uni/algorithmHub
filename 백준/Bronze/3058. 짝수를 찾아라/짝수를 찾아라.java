import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] x;
        int a = 0;
        int min = 100;
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            x = br.readLine().split(" ");
            for (String s : x) {
                a = Integer.parseInt(s);
                if (a % 2 == 0) {
                    sum += a;
                    if (min > a) {
                        min = a;
                    }
                }
            }
            sb.append(sum).append(" ").append(min).append("\n");
            min = 100;
            sum = 0;
        }
        System.out.println(sb);
    }
}
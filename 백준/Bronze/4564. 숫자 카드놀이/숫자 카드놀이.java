import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 1;
        while (true) {
            String x = br.readLine();
            if(x.equals("0")){
                break;
            }
            sb.append(x).append(" ");
            String[] y = x.split("");
            while (y.length > 1) {
                sum = 1;
                for (String s : y) {
                    sum *= Integer.parseInt(s);
                }
                sb.append(sum).append(" ");
                y=(sum+"").split("");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
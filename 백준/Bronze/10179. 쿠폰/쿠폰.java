import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        double x = 0;
        for(int i=0; i<n; i++){
            x = Double.parseDouble(br.readLine());
            x=x-x*0.2;
            sb.append(String.format("$%.2f",x)).append("\n");
        }
        System.out.println(sb);
    }
}
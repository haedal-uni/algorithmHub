import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        int sum = n;
        sb.append(n);
        for(int i=0; i<k; i++){
            sb.append("0");
            sum+=Integer.parseInt(sb.toString());
        }
        System.out.println(sum);
    }
}
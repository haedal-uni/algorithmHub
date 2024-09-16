import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int t = 0;
        for(int i=1;i<n+1; i++){
            sum+=i;
            t+=(int)Math.pow(i,3);
        }
        sb.append(sum).append("\n")
                .append((int)Math.pow(sum,2)).append("\n")
                .append(t);
        System.out.println(sb);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0L;
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<n; i++){
            sum+= (long) n *i+i;
        }
        System.out.println(sum);
    }
}
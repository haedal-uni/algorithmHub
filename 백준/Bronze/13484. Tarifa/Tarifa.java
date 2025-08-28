import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = x;
        int a = x;
        for(int i=0; i<n; i++){
            x = a;
            x-=Integer.parseInt(br.readLine());
            sum += x;
        }
        System.out.print(sum);
    }
}
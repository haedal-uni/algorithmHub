import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int a = 0;
        while (n!=1) {
            if(n%2 == 0) {
                n/=2;
            } else {
                n+=1;
            }
            a++;
        }
        System.out.print(a);
    }
}
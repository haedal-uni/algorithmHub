import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int y = 0;
        int n = 1;
        int x = 1 + 6 * n;
        if (num <= x) {
            if(num==1){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        } else {
            while (true) {
                y = 6 * (n + 1) + x;
            if (x <= num && y >= num) {
                    System.out.println(n + 2);
                    break;
                }
                x = y;
                n++;
            }
        }
    }
}
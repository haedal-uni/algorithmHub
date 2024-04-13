import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 0; i < x; i++) {
            String[] z = br.readLine().split(" ");
            int f = Integer.parseInt(z[0]);
            for(int a=1; a<f; a++){
                int c = Integer.parseInt(z[a]);
                for(int b=a+1; b<z.length; b++){
                    if(a!=b){
                        sum+= gcd(c,Integer.parseInt(z[b]));
                    }
                }
            }
            sb.append(sum).append("\n");
            sum = 0;
        }
        System.out.println(sb);
    }

    public static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }
}
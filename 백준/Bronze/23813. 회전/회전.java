import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String s = x;
        int n = x.length()-1;
        long sum = 0;
        while (true){
            String y = x.charAt(n) + x.substring(0,n);
            x = y;
            if(s.equals(y)){
                sum+=Long.parseLong(s);
                break;
            }
            sum+=Long.parseLong(y);
        }
        System.out.print(sum);
    }
}
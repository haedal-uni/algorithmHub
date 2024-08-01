import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int week = 60*60*24*7;
        long x = f(Integer.parseInt(br.readLine()));
        System.out.println(x/week);
    }
    public static long f(int x){
        if(x==1){
            return 1;
        }
        return x*f(x-1);
    }
}
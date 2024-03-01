import java.io.*;
public class Main {
    static int sum = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(d(x));
    }
    public static int d(int n){
        if(n<=2){
            if(n==2){
                sum*=2;
            }
            return sum;
        }else{
            sum*=n*(n-1);
            return d(n-2);
        }
    }
}
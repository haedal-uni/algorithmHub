import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count1;
    static int count2;
    static int[] f;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        f = new int[N+1];
        fib(N);
        fibonacci(N);
        System.out.println(count1 + " " + count2);
    }
    public static int fib(int x) {
        if(x==1||x==2){
            count1++;
            return 1;
        }else{
            return fib(x-1)+ fib(x-2);
        }
    }
    public static int fibonacci(int x){
        f[1]=1;
        f[2]=1;
        for(int i=3; i<x+1; i++){
            f[i] = f[i-1]+f[i-2];
            count2++;
        }
        return f[x];
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }
    public static Long factorial(int n){
        if (n<2){
            return 1L;
        }else{
            return n*factorial(n-1);
        }
    }
}

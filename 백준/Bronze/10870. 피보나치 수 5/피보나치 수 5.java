import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(f(Integer.parseInt(br.readLine())));
    }
    public static int f(int x){
        if (x<2) {
            return x;
        }
        return f(x-1) + f(x-2);
    }
}
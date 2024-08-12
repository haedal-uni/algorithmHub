import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        int x = 0;
        set.add(n);
        while (true){
            if(n==1){
                System.out.println("HAPPY");
                break;
            }
            x = 0;
            while (n!=0){
                x+=(n%10)*(n%10);
                n/=10;
            }
            n=x;
            if(set.contains(n)){
                System.out.println("UNHAPPY");
                break;
            }
            set.add(n);
        }
    }
}
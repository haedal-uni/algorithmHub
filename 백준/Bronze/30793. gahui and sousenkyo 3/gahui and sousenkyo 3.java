import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double x = (double) a/b;
        if(x<0.2){
            System.out.print("weak");
        }else if(x<0.4){
            System.out.print("normal");
        }else if(x<0.6){
            System.out.print("strong");
        }else{
            System.out.print("very strong");
        }
    }
}
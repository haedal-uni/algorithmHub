import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        char c = x.charAt(0);
        for(int i=1; i<x.length(); i++){
            if(c != x.charAt(i)){
                System.out.print(i);
                return;
            }
        }
        System.out.print(x.length());
    }
}
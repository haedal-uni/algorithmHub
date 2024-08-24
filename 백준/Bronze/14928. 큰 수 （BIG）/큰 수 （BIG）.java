import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        long num = 0L;
        for(int i=0; i<x.length(); i++){
            num = (num*10+(x.charAt(i)-'0'))%20000303;
        }
        System.out.println(num);
    }
}
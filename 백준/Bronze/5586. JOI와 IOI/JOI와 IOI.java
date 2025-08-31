import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int a = 0;
        int b = 0;
        for(int i=0; i<x.length()-2; i++){
            if(x.startsWith("JOI", i)){
                a++;
            }else if(x.startsWith("IOI", i)){
                b++;
            }
        }
        System.out.print(a + "\n" + b);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int y = Integer.parseInt(x);
        if(x.contains("7")){
            if(y%7==0) System.out.print(3);
            else System.out.print(2);
        }else{
            if(y%7==0) System.out.print(1);
            else System.out.print(0);
        }
    }
}
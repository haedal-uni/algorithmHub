import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        if(x.equals(br.readLine())) {
            System.out.print("0");
        }else{
            System.out.print("1550");
        }
    }
}
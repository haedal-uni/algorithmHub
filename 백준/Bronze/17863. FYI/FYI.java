import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine().substring(0,3);
        if(x.equals("555")){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
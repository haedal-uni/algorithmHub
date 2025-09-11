import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String x = br.readLine();
        if(x.substring(n-1).equals("G")){
            System.out.print(x.substring(0,n-1));
        }else{
            System.out.print(x+"G");
        }
    }
}
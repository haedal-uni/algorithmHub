import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = "WelcomeToSMUPC".split("");
        int n = Integer.parseInt(br.readLine())%14;
        if(n==0){
            System.out.print("C");
        }else{
            System.out.print(x[n-1]);
        }
    }
}
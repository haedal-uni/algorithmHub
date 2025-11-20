import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n>=13){
            System.out.print(n+1);
        }else{
            System.out.print(n);
        }
    }
}
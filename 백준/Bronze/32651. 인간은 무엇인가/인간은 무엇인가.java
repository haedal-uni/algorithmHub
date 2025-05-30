import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if(x%2024==0 && x<=100000){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
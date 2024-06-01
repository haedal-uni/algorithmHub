import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = (int) (n-(n*0.22));
        int y = (int) (n-n*0.2*0.22);
        System.out.println(x+" "+ y);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        for(int i=0; i<5; i++){
            x += Integer.parseInt(br.readLine());
        }
        System.out.println(x);
    }
}
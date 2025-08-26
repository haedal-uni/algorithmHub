import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = p*50-10*c;
        if(p>c){
            x+=500;
        }
        System.out.print(x);
    }
}
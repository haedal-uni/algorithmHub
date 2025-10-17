import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());
        int x = a2*2+a3*2*2;
        int y = a1*2+a3*2;
        int z = a1*2*2+a2*2;
        System.out.print(Math.min(x,Math.min(y,z)));
    }
}
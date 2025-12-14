import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] x = br.readLine().split(" ");
        int a = Integer.parseInt(x[0]);
        int b = Integer.parseInt(x[1]);
        System.out.print(Integer.parseInt(x[x.length-1])+(b-a));
    }
}
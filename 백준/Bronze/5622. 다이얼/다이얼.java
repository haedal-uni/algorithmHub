import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split("");
        int x = 0;
        for (String s : st) {
            x += ((((int) s.charAt(0)) - 65) / 3) + 3;
            if(s.equals("S")||s.equals("V")||s.equals("Y")||s.equals("Z")){
                x-=1;
            }
        }
        System.out.println(x);
    }
}
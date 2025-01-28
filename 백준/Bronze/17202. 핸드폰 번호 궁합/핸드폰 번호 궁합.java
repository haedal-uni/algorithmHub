import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] x = br.readLine().split("");
        String[] y = br.readLine().split("");
        int num = 0;
        for(int i=0; i<x.length; i++){
            sb.append(x[i]).append(y[i]);
        }
        while (sb.length()>2){
            x = sb.toString().split("");
            sb.delete(0, sb.length());
            for(int i=0; i<x.length-1; i++){
                num = (Integer.parseInt(x[i]) + Integer.parseInt(x[i+1]))%10;
                sb.append(num);
            }
        }
        System.out.print(sb);
    }
}
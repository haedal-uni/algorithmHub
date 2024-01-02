import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String[] y = br.readLine().split(" ");
        int max = -9999999;
        int min = 9999999;
        for (int i=0; i<x; i++){
            if(max<Integer.parseInt(y[i])){
                max = Integer.parseInt(y[i]);
            }
            if(min>Integer.parseInt(y[i])){
                min = Integer.parseInt(y[i]);
            }
        }
        System.out.print(min + " " + max);
    }
}
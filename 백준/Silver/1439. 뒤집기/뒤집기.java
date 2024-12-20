import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int count = 0;
        String s = x[0];
        for(int i=1; i<x.length; i++){
            if(!x[i].equals(s) && !x[i].equals(x[0])){
                count++;
            }
            s=x[i];
        }
        System.out.print(count);
    }
}
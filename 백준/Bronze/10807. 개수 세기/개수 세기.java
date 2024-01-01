import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String[] y = br.readLine().split(" ");
        int z = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=0; i<x; i++){
            if(z==Integer.parseInt(y[i])){
                count++;
            }
        }
        System.out.print(count);
    }
}
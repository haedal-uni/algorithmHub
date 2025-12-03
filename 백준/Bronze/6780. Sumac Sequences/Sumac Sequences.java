import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = 0;
        int i = 2;
        while (true){
            z = x-y;
            i++;
            if(y<z){
                System.out.print(i);
                break;
            }
            x=y;
            y=z;
        }
    }
}
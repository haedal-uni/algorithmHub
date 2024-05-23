import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        int x = a*p;
        int y = 0;
        if(p<=c){
            y = b;
        }else{
            y = (p-c)*d+b;
        }
        System.out.println(Math.min(x,y));
    }
}
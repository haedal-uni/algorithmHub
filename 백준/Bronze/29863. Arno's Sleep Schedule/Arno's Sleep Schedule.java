import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y;
        if(x>19){
            x=24-x;
            y = Integer.parseInt(br.readLine());
            System.out.println(x+y);
        }else{
            y=Integer.parseInt(br.readLine());
            System.out.println(y-x);
        }
    }
}
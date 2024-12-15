import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        if(m>2){
            System.out.print("After");
        }else if(m==1){
            System.out.print("Before");
        }else{
            int d = Integer.parseInt(br.readLine());
            if(d==18){
                System.out.print("Special");
            }else if(d>18){
                System.out.print("After");
            }else{
                System.out.print("Before");
            }
        }
    }
}
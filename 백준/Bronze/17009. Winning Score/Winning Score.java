import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        for(int i=3; i>0; i--){
            a+=Integer.parseInt(br.readLine())*i;
        }
        for(int i=3; i>0; i--){
            b+=Integer.parseInt(br.readLine())*i;
        }
        if(a>b){
            System.out.print("A");
        }else if(b>a){
            System.out.print("B");
        }else{
            System.out.print("T");
        }
    }
}
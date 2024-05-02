import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 300;
        int b = 60;
        int c = 10;
        int x = 0;
        int y = 0;
        int z = 0;
        int n = Integer.parseInt(br.readLine());
        if(n/a>0){
            x=n/a;
            n%=a;
        }
        if(n/b>0){
            y=n/b;
            n%=b;
        }
        if(n/c>0){
            z=n/c;
            n%=c;
        }
        if(n!=0){
            System.out.println(-1);
        }else{
            System.out.println(x + " " + y + " " + z);
        }
    }
}
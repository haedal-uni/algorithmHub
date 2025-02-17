import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<10; i++) {
            x = Integer.parseInt(st1.nextToken());
            y = Integer.parseInt(st2.nextToken());
            if(x>y){
                a++;
            }else if(x<y){
                b++;
            }
        }
        if(a>b){
            System.out.print("A");
        }else if(b>a){
            System.out.print("B");
        }else{
            System.out.print("D");
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int i=0;
        while (true){
            if(a>=5 || b>=5){
                break;
            }
            if(i%2==0){
                b+=a;
            }else{
                a+=b;
            }
            i++;
        }
        if(a>=5){
            System.out.print("yj");
        }else{
            System.out.print("yt");
        }
    }
}
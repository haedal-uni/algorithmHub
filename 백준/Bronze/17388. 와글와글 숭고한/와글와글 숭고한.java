import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        if((s+k+h)>99){
            System.out.print("OK");
        }else{
            int min = Math.min(s, Math.min(k, h));
            if(s==min){
                System.out.print("Soongsil");
            }else if(k==min){
                System.out.print("Korea");
            }else{
                System.out.print("Hanyang");
            }
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int a = a2/b1;
        if(a2%b1!=0){
            a+=1;
        }
        int b = b2/a1;
        if(b2%a1!=0){
            b+=1;
        }
        if(a==b){
            System.out.print("DRAW");
        }else if(a>b){
            System.out.print("PLAYER A");
        }else{
            System.out.print("PLAYER B");
        }
    }
}
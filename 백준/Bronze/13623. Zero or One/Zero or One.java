import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if(a==b & b==c){
            System.out.print("*");
        }else if(a==b){
            System.out.print("C");
        }else if(a==c){
            System.out.print("B");
        }else if(b==c){
            System.out.print("A");
        }
    }
}
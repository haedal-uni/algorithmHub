import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())*7;
        int b = Integer.parseInt(st.nextToken())*13;
        if(a>b){
            System.out.print("Axel");
        }else if(a==b){
            System.out.print("lika");
        }else{
            System.out.print("Petra");
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int d= Integer.parseInt(st.nextToken());
        if(a-1>c && b-1>d){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}
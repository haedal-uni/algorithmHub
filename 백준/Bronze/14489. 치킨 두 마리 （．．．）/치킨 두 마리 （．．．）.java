import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(br.readLine());
        a = a+b;
        c = 2*c;
        if(a<c){
            System.out.println(a);
        }else{
            System.out.println(a-c);
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        double b = 1.5;
        StringTokenizer st = new StringTokenizer(br.readLine());
        a=Integer.parseInt(st.nextToken())*13+
        Integer.parseInt(st.nextToken())*7+
        Integer.parseInt(st.nextToken())*5+
        Integer.parseInt(st.nextToken())*3+
        Integer.parseInt(st.nextToken())*3+
        Integer.parseInt(st.nextToken())*2;
        st = new StringTokenizer(br.readLine());
        b+=Integer.parseInt(st.nextToken())*13+
                Integer.parseInt(st.nextToken())*7+
                Integer.parseInt(st.nextToken())*5+
                Integer.parseInt(st.nextToken())*3+
                Integer.parseInt(st.nextToken())*3+
                Integer.parseInt(st.nextToken())*2;
        if(a>b){
            System.out.print("cocjr0208");
        }else{
            System.out.print("ekwoo");
        }
    }
}
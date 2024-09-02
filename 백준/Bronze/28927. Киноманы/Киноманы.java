import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0;
        st = new StringTokenizer(br.readLine()," ");
        max+=Integer.parseInt(st.nextToken())*3;
        max+=Integer.parseInt(st.nextToken())*20;
        max+=Integer.parseInt(st.nextToken())*120;
        st=new StringTokenizer(br.readLine()," ");
        max-=Integer.parseInt(st.nextToken())*3;
        max-=Integer.parseInt(st.nextToken())*20;
        max-=Integer.parseInt(st.nextToken())*120;
        if(max>0){
            System.out.println("Max");
        }else if(max<0){
            System.out.println("Mel");
        }else{
            System.out.println("Draw");
        }
    }
}
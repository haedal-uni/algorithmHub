import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        if(s.equals("miss")){
            System.out.print(0);
        }else if(s.equals("bad")){
            System.out.print(200*x);
        }else if(s.equals("cool")){
            System.out.print(400*x);
        }else if(s.equals("great")){
            System.out.print(600*x);
        }else{
            System.out.print(1000*x);
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String t = st.nextToken();
        int a = 0;
        int b = 0;
        for(int i=0; i<s.length(); i++){
            a+= Integer.parseInt(s.charAt(i)+"");
        }
        a*=s.length();
        for(int i=0; i<t.length(); i++){
            b+= Integer.parseInt(t.charAt(i)+"");
        }
        b*=t.length();
        if(a>b){
            System.out.print("1");
        }else if(a<b){
            System.out.print("2");
        }else{
            System.out.print("0");
        }
    }
}
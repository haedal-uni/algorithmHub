import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(),":");
        h = Integer.parseInt(st.nextToken())-h;
        m = Integer.parseInt(st.nextToken())-m;
        s = Integer.parseInt(st.nextToken())-s;
        if(s<0){
            s = 60+s;
            m-=1;
        }
        if(m<0){
            m = 60+m;
            h-=1;
        }
        if(h<0){
            h+=24;
        }
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}
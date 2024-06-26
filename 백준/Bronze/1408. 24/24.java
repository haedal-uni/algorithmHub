import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int h1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(),":");
        int h2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s = s2-s1;
        int m = 0;
        int h = 0;
        if(s<0){
            s = 60+s;
            m2-=1;
        }
        m = m2-m1;
        if(m<0){
            m = 60+m;
            h2-=1;
        }
        h = h2-h1;
        if(h<0){
            h+=24;
        }
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}

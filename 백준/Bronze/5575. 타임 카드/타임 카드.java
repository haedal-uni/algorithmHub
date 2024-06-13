import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int h = 0;
        int m = 0;
        int s = 0;
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine()," ");
            h -= Integer.parseInt(st.nextToken());
            m -= Integer.parseInt(st.nextToken());
            s -= Integer.parseInt(st.nextToken());
            h += Integer.parseInt(st.nextToken());
            m += Integer.parseInt(st.nextToken());
            s += Integer.parseInt(st.nextToken());
            if(s<0){
                m-=1;
                s+=60;
            }
            if(m<0){
                h-=1;
                m+=60;
            }
            sb.append(h).append(" ").append(m).append(" ").append(s).append("\n");
            h = 0;
            m = 0;
            s = 0;
        }
        System.out.println(sb);
    }
}
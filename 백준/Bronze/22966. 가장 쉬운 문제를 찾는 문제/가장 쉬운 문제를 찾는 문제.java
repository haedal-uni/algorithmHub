import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        int m = 10;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int level = Integer.parseInt(st.nextToken());
            if(m>level){
                sb.delete(0,sb.length());
                sb.append(s);
                m = level;
            }
        }
        System.out.print(sb);
    }
}
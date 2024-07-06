import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<2; i++){
            st = new StringTokenizer(br.readLine()," ");
            sum+=Integer.parseInt(st.nextToken())*6;
            sum+=Integer.parseInt(st.nextToken())*3;
            sum+=Integer.parseInt(st.nextToken())*2;
            sum+=Integer.parseInt(st.nextToken());
            sum+=Integer.parseInt(st.nextToken())*2;
            sb.append(sum).append(" ");
            sum=0;
        }
        System.out.println(sb);
    }
}
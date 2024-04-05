import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = a(x,y);
        sb.append(x/z).append(":").append(y/z);
        System.out.println(sb);

    }
    public static int a(int x, int y){
        if(x%y==0){
            return y;
        }
        return a(y, x%y);
    }
}
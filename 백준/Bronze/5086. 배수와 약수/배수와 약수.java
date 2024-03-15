import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        while (true){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x==0 && y==0){
                break;
            }
            if(x/y>0 && x%y==0){
                sb.append("multiple").append("\n");
            } else if(y/x>0 && y%x==0){
                sb.append("factor").append("\n");
            }else {
                sb.append("neither").append("\n");
            }
        }
        System.out.println(sb);
    }
}
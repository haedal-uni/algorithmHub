import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        if(x==a){
            sb.append(i).append(" ");
        }else{
            if(a==i){
                sb.append(x).append(" ");
            }else{
                sb.append(a).append(" ");
            }
        }
        if(y==b){
            sb.append(j);
        }else{
            if(b==j){
                sb.append(y);
            }else{
                sb.append(b);
            }
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x==0 && y==0) {
                break;
            }
            if(x+y==13){
                sb.append("Never speak again.").append('\n');
            }else if(x>y){
                sb.append("To the convention.").append('\n');
            }else if(x<y){
                sb.append("Left beehind.").append('\n');
            }else{
                sb.append("Undecided.").append('\n');
            }
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            String[] s = br.readLine().split(" ");
            boolean a = false;
            boolean b = false;
            if(x==Integer.parseInt(s[0])){
                a = true;
            }
            if(y==Integer.parseInt(s[N-1])){
                b = true;
            }
            if(a && b){
                sb.append("BOTH").append("\n");
            }else if(!a && !b){
                sb.append("OKAY").append("\n");
            }else if(a){
                sb.append("EASY").append("\n");
            }else{
                sb.append("HARD").append("\n");
            }
        }
        System.out.print(sb);
    }
}
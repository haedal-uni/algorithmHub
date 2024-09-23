import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x>=y){
                sb.append("MMM BRAINS").append("\n");
            }else{
                sb.append("NO BRAINS").append("\n");
            }
        }
        System.out.println(sb);
    }
}
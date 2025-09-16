import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
            if(a>=10 && b>=10 && c>=10){
                sb.append("triple-double").append("\n");
            }else if(a>=10 && b>=10 || a>=10 && c>=10 || b>=10 && c>=10){
                sb.append("double-double").append("\n");
            }else if(a>=10 || b>=10 || c>=10){
                sb.append("double").append("\n");
            }else{
                sb.append("zilch").append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
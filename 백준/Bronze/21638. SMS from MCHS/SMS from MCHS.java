import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int v1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        if(t2<0 && v2>=10){
            sb.append("A storm warning for tomorrow! Be careful and stay home if possible!");
        }else if(t1>t2){
            sb.append("MCHS warns! Low temperature is expected tomorrow.");
        }else if(v2>v1){
            sb.append("MCHS warns! Strong wind is expected tomorrow.");
        }else{
            sb.append("No message").append("\n");
        }
        System.out.print(sb);
    }
}
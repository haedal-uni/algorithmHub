import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Data set: ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            sb.append(x).append(" ").append(y).append(" ").append(z).append("\n");
            for(int j=0; j<z; j++){
                if(x>y){
                    x/=2;
                }else{
                    y/=2;
                }
            }
            if(x>y){
                sb.append(x).append(" ").append(y).append("\n").append("\n");
            }else{
                sb.append(y).append(" ").append(x).append("\n").append("\n");
            }
        }
        System.out.print(sb);
    }
}
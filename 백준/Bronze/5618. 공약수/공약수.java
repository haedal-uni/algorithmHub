import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        int z = 0;
        if(n==2){
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for(int i=1; i<=Math.min(x,y); i++){
                if(x%i==0&&y%i==0){
                    sb.append(i).append("\n");
                }
            }
        }else{
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            for(int i=1; i<=Math.min(x,Math.min(y,z)); i++){
                if(x%i==0&&y%i==0&&z%i==0){
                    sb.append(i).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
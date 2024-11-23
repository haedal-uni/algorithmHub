import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder z = new StringBuilder();
        StringTokenizer st;
        int x = 0;
        int y = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            for(int j=0; j<x; j++){
                st = new StringTokenizer(br.readLine());
                y = Integer.parseInt(st.nextToken());
                if(max<y){
                    z.delete(0, z.length());
                    max = y;
                    z.append(st.nextToken());
                }else{
                    st.nextToken();
                }
            }
            sb.append(z).append("\n");
            max = 0;
        }
        System.out.print(sb);
    }
}
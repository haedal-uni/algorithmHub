import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        int h=0;
        int n=0;
        for(int i=0; i<x; i++){
            st = new StringTokenizer(br.readLine(), " ");
            h = Integer.parseInt(st.nextToken());
            st.nextToken();
            n = Integer.parseInt(st.nextToken());
            if(n%h==0){
                if((n/h)>=10){
                    sb.append(h).append(n/h).append("\n");
                }else {
                    sb.append(h).append(0).append(n/h).append("\n");
                }
            }else{
                if((n/h)+1>9){
                    sb.append(n%h).append((n/h)+1).append("\n");
                }else {
                    sb.append(n%h).append(0).append((n/h)+1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
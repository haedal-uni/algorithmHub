import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int d = 0;
        for(int i=0; i<k; i++){
            d = Integer.parseInt(st.nextToken())*100/n;
            if(d>=0 && d<=4){
                sb.append(1).append(" ");
            }else if(d<=11){
                sb.append(2).append(" ");
            }else if(d<=23){
                sb.append(3).append(" ");
            }else if(d<=40){
                sb.append(4).append(" ");
            }else if(d<=60){
                sb.append(5).append(" ");
            }else if(d<=77){
                sb.append(6).append(" ");
            }else if(d<=89){
                sb.append(7).append(" ");
            }else if(d<=96){
                sb.append(8).append(" ");
            }else{
                sb.append(9).append(" ");
            }
        }
        System.out.print(sb);
    }
}
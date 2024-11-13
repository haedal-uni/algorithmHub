import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int y = 0;
        int k = 0;
        StringTokenizer st;
        for(int i=0; i<n; i++){
            for(int j=0; j<9; j++){
                st = new StringTokenizer(br.readLine()," ");
                y+=Integer.parseInt(st.nextToken());
                k+=Integer.parseInt(st.nextToken());
            }
            if(y>k){
                sb.append("Yonsei").append("\n");
            }else if(k>y){
                sb.append("Korea").append("\n");
            }else{
                sb.append("Draw").append("\n");
            }
            y=0;
            k=0;
        }
        System.out.print(sb);
    }
}
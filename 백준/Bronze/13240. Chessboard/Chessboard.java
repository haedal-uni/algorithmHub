import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<m; j++){
                    if(j%2==0){
                        sb.append('*');
                    }else{
                        sb.append('.');
                    }
                }
            }else{
                for(int j=0; j<m; j++){
                    if(j%2==0){
                        sb.append('.');
                    }else{
                        sb.append('*');
                    }
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
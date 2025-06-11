import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            if(s.equals("C")){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<m; j++){
                    sb.append(st.nextToken().charAt(0)-64).append(" ");
                }
            }else{
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<m; j++){
                    char c = (char) (Integer.parseInt(st.nextToken())+64);
                    sb.append(c).append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[] a;
        String[] b;
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            a = st.nextToken().split("");
            b = st.nextToken().split("");
            sb.append("Distances: ");
            for(int j=0; j<a.length; j++){
                x = a[j].charAt(0)-64;
                y = b[j].charAt(0)-64;
                if(x>y){
                    sb.append(y+26-x).append(" ");
                }else{
                    sb.append(y-x).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
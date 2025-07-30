import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean zack = false;
        boolean mack = false;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            x = st.countTokens();
            zack=false;
            mack=false;
            for(int j=0;j<x;j++) {
                String s = st.nextToken();
                if(s.equals("18")){
                    mack = true;
                }else if(s.equals("17")){
                    zack = true;
                }
                sb.append(s).append(" ");
            }
            if(zack && mack){
                sb.append("\n").append("both").append("\n\n");
            }else if(!zack && !mack){
                sb.append("\n").append("none").append("\n\n");
            }else if(zack){
                sb.append("\n").append("zack").append("\n\n");
            }else {
                sb.append("\n").append("mack").append("\n\n");
            }
        }
        System.out.print(sb);
    }
}
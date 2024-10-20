import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int x = 0;
        StringBuilder s = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            x = st.countTokens();
            for(int j=0; j<x; j++){
                s.append(st.nextToken()).reverse();
                sb.append(s).append(" ");
                s.delete(0, s.length());
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
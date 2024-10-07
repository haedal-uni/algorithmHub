import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        int x = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            x = st.countTokens();
            sb.append(st.nextToken()).append(" ").append(st.nextToken());
            for(int j=0;j<x-2; j++){
                ss.append(st.nextToken()).append(" ");
            }
            ss.append(sb).append("\n");
            sb.delete(0, sb.length());
        }
        System.out.println(ss);
    }
}
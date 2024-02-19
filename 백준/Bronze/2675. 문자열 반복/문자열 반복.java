import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        String[] ans;
        for(int i=0; i<x; i++){
            st = new StringTokenizer(br.readLine(), " ");
            count = Integer.parseInt(st.nextToken());
            ans = st.nextToken().split("");
            for(int j=0; j<ans.length; j++){
                sb.append(ans[j].repeat(count));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
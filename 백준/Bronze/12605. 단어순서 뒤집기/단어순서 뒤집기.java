import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder x = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            x.delete(0, x.length());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = st.countTokens();
            for(int j=0; j<a; j++){
                x.insert(0, st.nextToken()+ " ");
            }
            sb.append("Case #").append(i+1).append(": ").append(x).append("\n");
        }
        System.out.print(sb);
    }
}
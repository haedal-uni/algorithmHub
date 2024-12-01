import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int young = 19890101;
        int old = 20111231;
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
            sb.append(String.format("%02d", Integer.parseInt(st.nextToken())));
            sb.insert(0,String.format("%02d", Integer.parseInt(st.nextToken())));
            sb.insert(0,st.nextToken());
            x = Integer.parseInt(sb.toString());
            if(x>young){
                young = x;
                a.delete(0, a.length());
                a.append(arr[i]);
            }
            if(x<old){
                old = x;
                b.delete(0, b.length());
                b.append(arr[i]);
            }
            sb.delete(0, sb.length());
        }
        sb.append(a).append("\n").append(b);
        System.out.print(sb);
    }
}
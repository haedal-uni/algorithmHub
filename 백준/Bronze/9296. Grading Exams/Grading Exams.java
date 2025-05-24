import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int l =0;
        String x = "";
        String y = "";
        int count = 0;
        for(int i=0; i<n; i++){
            l = Integer.parseInt(br.readLine());
            x = br.readLine();
            y = br.readLine();
            count = 0;
            for(int j=0; j<l; j++){
                if(x.charAt(j) != y.charAt(j)){
                    count++;
                }
            }
            sb.append("Case ").append(i+1).append(": ").append(count).append("\n");
        }
        System.out.print(sb);
    }
}
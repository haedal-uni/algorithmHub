import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            boolean valid = true;
            StringBuilder temp = new StringBuilder();
            for(int j=0; j<3; j++){
                int x = Integer.parseInt(st.nextToken());
                if(x<l) {
                    valid = false;
                }
                sum += x;
                temp.append(x).append(" ");
            }
            if(valid && sum>=k) {
                count++;
                sb.append(temp);
            }
        }
        System.out.println(count);
        System.out.print(sb);
    }
}
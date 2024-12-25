import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String x;
        int sum = 0;
        for(int i=0; i<n; i++) {
            list.add(br.readLine());
        }
        for(int i=0; i<m; i++) {
            x = br.readLine();
            if(list.contains(x)) {
                sum++;
            }
        }
        System.out.print(sum);
    }
}
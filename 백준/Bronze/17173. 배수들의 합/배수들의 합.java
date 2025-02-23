import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[m];
        int sum = 0;
        int x = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            for(int j=1; j*arr[i]<=n; j++) {
                x=arr[i]*j;
                if(!set.contains(x)) {
                    set.add(x);
                    sum+=x;
                }
            }
        }
        System.out.print(sum);
    }
}
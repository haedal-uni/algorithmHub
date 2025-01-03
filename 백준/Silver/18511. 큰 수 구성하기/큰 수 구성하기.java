import java.io.*;
import java.util.*;
public class Main {
    static int n, k, ans;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[k];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        f(0);
        System.out.print(ans);
    }

    public static void f(int sum) {
        if (sum > n){
            return;
        }
        if (ans < sum){
            ans = sum;
        }
        for (int i=k-1; i>=0; i--) {
            f(sum*10 + arr[i]);
        }
    }
}
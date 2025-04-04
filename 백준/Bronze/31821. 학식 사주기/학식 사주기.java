import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            sum+=arr[Integer.parseInt(br.readLine())-1];
        }
        System.out.print(sum);
    }
}
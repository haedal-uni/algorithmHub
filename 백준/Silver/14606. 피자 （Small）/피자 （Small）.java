import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        arr[2] = 1;
        for(int i=3; i<n+1; i++){
            arr[i] = i-1+arr[i-1];
        }
        System.out.println(arr[n]);
    }
}
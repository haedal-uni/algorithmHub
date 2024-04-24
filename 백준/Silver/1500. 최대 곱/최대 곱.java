import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = s%k;
        long sum = 1;
        int[] arr = new int[k];
        for(int i=0; i<x; i++){
            arr[i] = 1;
        }
        for(int i=0; i<k; i++){
            sum*=arr[i]+s/k;
        }
        System.out.println(sum);
    }
}
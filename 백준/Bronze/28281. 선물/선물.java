import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        String[] arr = br.readLine().split(" ");
        int a = 0;
        int b = 0;
        for(int i=0; i<n-1; i++) {
            a = Integer.parseInt(arr[i]);
            b = Integer.parseInt(arr[i+1]);
            if(a*x+b*x<min){
                min = a*x+b*x;
            }
        }
        System.out.print(min);
    }
}
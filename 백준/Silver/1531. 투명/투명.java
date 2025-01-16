import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[101][101];
        int count = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for(int j=a; j<=c; j++){
                for(int k=b; k<=d; k++){
                    arr[j][k]++;
                }
            }
        }
        for(int i=0; i<101; i++){
            for(int j=0; j<101; j++){
                if(arr[i][j] > m){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];
        int count = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a+1; j<=a+10; j++){
                for(int k=b+1; k<=b+10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i=0; i<101; i++){
            for(int j=0; j<101; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
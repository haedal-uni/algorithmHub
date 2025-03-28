import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[2][6];
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())-1]++;
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<6; j++){
                sum+=arr[i][j]/k;
                if(arr[i][j]%k>0){
                    sum+=1;
                }
            }
        }
        System.out.println(sum);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        int[] arr2 = new int[n];
        StringTokenizer st;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(j==k){
                        continue;
                    }
                    if(arr[j][i]!=arr[k][i]){
                        sum=arr[j][i];
                    }else{
                        sum=0;
                        break;
                    }
                }
                arr2[j]+=sum;
                sum=0;
            }
        }
        for(int i=0; i<n; i++){
            sb.append(arr2[i]).append("\n");
        }
        System.out.println(sb);
    }
}
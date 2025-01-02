import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum==m){
                count++;
                sum = 0;
                continue;
            }else if(sum>m){
                sum = 0;
                continue;
            }
            for(int j=i+1; j<n; j++){
                sum+=arr[j];
                if(sum==m){
                    count++;
                    break;
                }else if(sum>m){
                    break;
                }
            }
            sum = 0;
        }
        System.out.print(count);
    }
}
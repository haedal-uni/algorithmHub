import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[6];
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        for(int i=0; i<6; i++){
            sum += arr[i]/t;
            if(arr[i]%t!=0){
                sum+=1;
            }
        }
        sb.append(sum).append("\n");
        sb.append(n/p).append(" ").append(n%p);
        System.out.print(sb);
    }
}
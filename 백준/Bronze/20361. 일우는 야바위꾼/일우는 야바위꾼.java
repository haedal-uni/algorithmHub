import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        arr[x-1] = 1;
        int temp = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken())-1;
            b = Integer.parseInt(st.nextToken())-1;
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                System.out.print(i+1);
                break;
            }
        }
    }
}
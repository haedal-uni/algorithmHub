import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = new int[]{1, 2, 3};
        int temp = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            temp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = temp;
        }
        for(int i=0; i<3; i++){
            if(arr[i]==1){
                System.out.print(i+1);
                break;
            }
        }
    }
}
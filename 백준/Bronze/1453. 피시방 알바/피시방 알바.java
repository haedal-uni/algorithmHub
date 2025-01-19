import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[101];
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int x = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            x = Integer.parseInt(st.nextToken());
            if(arr[x] == 0){
                arr[x] = 1;
            }else{
                count++;
            }
        }
        System.out.print(count);
    }
}
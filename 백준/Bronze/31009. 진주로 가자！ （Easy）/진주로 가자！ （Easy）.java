import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int fee = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("jinju")){
                fee = Integer.parseInt(st.nextToken());
            }else{
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] > fee){
                count++;
            }
        }
        System.out.print(fee +"\n" + count);
    }
}
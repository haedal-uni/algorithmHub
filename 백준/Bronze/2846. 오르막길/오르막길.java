import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int x = 0;
        int y = 0;
        int diff = 0;
        int sum = 0;
        boolean correct = false;
        for(int i=0; i<n-1; i++){
            x=arr[i];
            y=arr[i+1];
            diff = y-x;
            if(diff>0){
                correct = true;
                sum+=diff;
            }else{
                if(max<sum){
                    max = sum;
                }
                sum=0;
            }
        }
        if(max<sum){
            max=sum;
        }
        if(correct){
            System.out.print(max);
        }else{
            System.out.print(0);
        }
    }
}
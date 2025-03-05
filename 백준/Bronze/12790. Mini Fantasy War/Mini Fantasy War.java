import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[4];
            for(int j=0; j<8; j++){
                arr[j%4]+=Integer.parseInt(st.nextToken());
            }
            if(arr[0]<1){
                arr[0]=1;
            }
            if(arr[1]<1){
                arr[1]=1;
            }
            if(arr[2]<0){
                arr[2]=0;
            }
            sum=arr[0]+5*arr[1]+2*arr[2]+2*arr[3];
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
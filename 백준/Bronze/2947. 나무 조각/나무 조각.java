import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int i=0;
        int temp = 0;
        while (true){
            if(arr[0]==1&&arr[1]==2&&arr[2]==3&&arr[3]==4&&arr[4]==5){
                break;
            }
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                sb.append(arr[0]).append(" ").append(arr[1]).append(" ").append(arr[2]).append(" ").append(arr[3]).append(" ").append(arr[4]).append("\n");
            }
            i++;
            if(i==4){
                i=0;
            }
        }
        System.out.print(sb);
    }
}
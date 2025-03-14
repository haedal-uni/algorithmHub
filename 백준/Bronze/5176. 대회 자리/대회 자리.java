import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int[] arr = new int[y+1];
            int z = 0;
            for(int j=0; j<x; j++){
                z = Integer.parseInt(br.readLine());
                if(arr[z]==0){
                    arr[z]=1;
                }else{
                    count++;
                }
            }
            sb.append(count).append("\n");
            count = 0;
        }
        System.out.print(sb);
    }
}
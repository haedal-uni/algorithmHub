import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] arr = new int[y+1];
        if(y<=2){
            arr[0]=1;
            arr[1]=1;
            for(int i=x;i<y+1; i++){
                if(arr[i]==0){
                    sb.append(i);
                }
            }
        }else{
            for(int i=2; i<=Math.sqrt(y); i++){
                for(int j=i*i; j<=y; j+=i){
                    arr[j] = 1;
                }
            }
            arr[0]=1;
            arr[1]=1;
            for(int i=x;i<y+1; i++){
                if(arr[i]==0){
                    sb.append(i).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
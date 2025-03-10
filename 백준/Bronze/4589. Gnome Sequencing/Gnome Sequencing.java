import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:").append("\n");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            arr[0] = x;
            arr[1] = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[2] = y;
            Arrays.sort(arr);
            if(x==arr[0] && y==arr[2]|| x==arr[2]&&y==arr[0]){
                sb.append("Ordered").append("\n");
            }else{
                sb.append("Unordered").append("\n");
            }
        }
        System.out.print(sb);
    }
}
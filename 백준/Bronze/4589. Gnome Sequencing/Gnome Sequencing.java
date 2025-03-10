import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:").append("\n");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split(" ");
            arr[0] = Integer.parseInt(s[0]);
            arr[1] = Integer.parseInt(s[1]);
            arr[2] = Integer.parseInt(s[2]);
            Arrays.sort(arr);
            if(s[0].equals(arr[0]+"")&&s[2].equals(arr[2]+"")||s[0].equals(arr[2]+"")&&s[2].equals(arr[0]+"")){
                sb.append("Ordered").append("\n");
            }else{
                sb.append("Unordered").append("\n");
            }
        }
        System.out.print(sb);
    }
}
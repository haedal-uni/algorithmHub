import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        int a = 0;
        int b = 0;
        int c = 0;
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            a=arr[2];
            b=arr[1];
            c=arr[0];
            if(a==0 && b==0 && c==0){
                break;
            }
            if(a>=b+c){
                sb.append("Invalid").append("\n");
            }else if(b == c && a == b){
                sb.append("Equilateral").append("\n");
            }else if(a == b || b == c || c==a){
                sb.append("Isosceles").append("\n");
            }else {
                sb.append("Scalene").append("\n");
            }
        }
        System.out.println(sb);
    }
}
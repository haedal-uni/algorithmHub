import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int[] len =new int[]{b,c,d};
        int x = Math.min(b, Math.min(c, d));
        int[] arr;
        int max = 0;
        int sum = 0;
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            arr=new int[len[i]];
            for(int j=0; j<arr.length; j++){
                arr[j]=Integer.parseInt(st.nextToken());
                max += arr[j];
            }
            Arrays.sort(arr);
            for(int j=len[i]-x; j<len[i]; j++){
                sum+=(int)(arr[j]*0.9);
            }
            for(int j=0; j<len[i]-x; j++){
                sum+=arr[j];
            }
        }
        sb.append(max).append("\n");
        sb.append(sum);
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr;
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int max = 0;
        int min = 100;
        int gap = 0;
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken());
            arr = new int[x];
            for(int j=0; j<x; j++){
                y = Integer.parseInt(st.nextToken());
                arr[j] = y;
            }
            Arrays.sort(arr);
            for(int j=0; j<x-1; j++){
                gap = Math.max(gap, Math.abs(arr[j] - arr[j+1]));
            }
            max = arr[x-1];
            min = arr[0];
            sb.append("Class ").append(i).append("\n");
            sb.append("Max ").append(max).append(", ")
                    .append("Min ").append(min).append(", ")
                    .append("Largest gap ").append(gap).append("\n");
            gap = 0;
        }
        System.out.print(sb);
    }
}
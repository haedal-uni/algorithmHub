import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int max = 0;
        int sum = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = 0;
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            x = Integer.parseInt(st.nextToken());
            if(max<x){
                max = x;
            }
        }
        st = new StringTokenizer(br.readLine()," ");
        sum+=max;
        max = 0;
        for(int i=0; i<m; i++){
            x = Integer.parseInt(st.nextToken());
            if(max<x){
                max = x;
            }
        }
        sum+=max;
        System.out.println(sum);
    }
}
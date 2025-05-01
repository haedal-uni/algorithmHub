import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<x; j++){
                if(Integer.parseInt(st.nextToken())==k){
                    count++;
                }
            }
        }
        if(count==n){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
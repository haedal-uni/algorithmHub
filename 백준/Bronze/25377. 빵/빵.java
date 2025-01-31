import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1001;
        int x = 0;
        int y = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x<=y){
                if(sum>y){
                    sum=y;
                }
            }
        }
        if(sum==1001){
            System.out.print(-1);
        }else{
            System.out.print(sum);
        }
    }
}
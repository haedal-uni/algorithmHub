import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            x+=Integer.parseInt(st.nextToken());
            if(x<0){
                x=0;
            }
            if(x>=m){
                count++;
            }
        }
        System.out.print(count);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        k-=n%2;
        n-=n%2;
        if(k>0){
            while (k!=0){
                if(n/2>=m){
                    n-=1;
                }else{
                    m-=1;
                }
                k-=1;
            }
        }
        System.out.print(Math.min(n/2, m));
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int d = 0;
        int g = 0;
        int max = 0;
        int x = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            if(a==d+g){
                x=(a*(d+g))*2;
            }else{
                x=a*(d+g);
            }
            if(x>max){
                max=x;
            }
        }
        System.out.print(max);
    }
}
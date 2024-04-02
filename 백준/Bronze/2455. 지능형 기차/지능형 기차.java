import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0;
        int sum = 0;
        for(int i=0; i<4; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sum-=Integer.parseInt(st.nextToken());
            sum+=Integer.parseInt(st.nextToken());
            if(max<sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
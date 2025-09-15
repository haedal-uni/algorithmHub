import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int min = 100001;
        int num = 0;
        for(int i=l; i<=r; i++){
            if(Math.abs(x-i)<min){
                min = Math.abs(x-i);
                num = i;
            }
        }
        System.out.print(num);
    }
}
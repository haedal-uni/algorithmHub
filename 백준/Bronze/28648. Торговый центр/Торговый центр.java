import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int x = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x=0;
            x+=Integer.parseInt(st.nextToken());
            x+=Integer.parseInt(st.nextToken());
            if(x<min){
                min=x;
            }
        }
        System.out.print(min);
    }
}
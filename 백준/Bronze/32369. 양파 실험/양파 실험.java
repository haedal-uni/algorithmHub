import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = 1;
        int y = 1;
        int temp = 0;
        for(int i=0; i<n; i++){
            x+=a;
            y+=b;
            if(x<y) {
                temp = x;
                x = y;
                y = temp;
            }
            if(x==y){
                y--;
            }
        }
        System.out.print(x + " " + y);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x>y){
                a++;
            }else if(x<y){
                b++;
            }
        }
        System.out.println(a + " " + b);
    }
}
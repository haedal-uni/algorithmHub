import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = 100;
        int s = 100;
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a<b){
                c-=b;
            }else if(a>b){
                s-=a;
            }
        }
        System.out.println(c + "\n" + s);
    }
}
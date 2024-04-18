import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int max = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a == b && b==c){
                sum = 10000+a*1000;
            }else if(a == b || b == c || a==c){
                if(a==b || b==c){
                    sum = 1000+b*100;
                }else{
                    sum = 1000+a*100;
                }
            }else{
                sum = Math.max(Math.max(a, b), c)*100;
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
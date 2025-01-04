import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 1;
        int max = m;
        int a = 0;
        for(int i=0; i<j; i++){
            a = Integer.parseInt(br.readLine());
            if(min<=a && a<=max){
                continue;
            }
            if(Math.abs(a-max)<Math.abs(a-min)){
                sum+=Math.abs(max-a);
                max = a;
                min = a-(m-1);
            }else{
                sum+=Math.abs(min-a);
                min = a;
                max = a+(m-1);
            }
        }
        System.out.print(sum);
    }
}
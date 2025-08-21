import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        long x = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n ; i++){
            if(st.nextToken().equals("0")){
                x-=1;
            }else{
                x+=1;
            }
            sum+=x;
        }
        System.out.print(sum);
    }
}
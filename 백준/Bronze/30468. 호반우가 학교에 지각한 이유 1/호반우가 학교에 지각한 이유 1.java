import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        int n = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            sum+=Integer.parseInt(st.nextToken());
        }
        n=Integer.parseInt(st.nextToken());
        if(sum/4>=n){
            System.out.print("0");
        }else{
            System.out.print((int) ((n-sum/4)/0.25));
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            if(sum>=512 && Math.abs(512-sum)<Math.abs(512-max)){
                max = sum;
            }
        }
        if(max==0){
            System.out.print(-1);
        }else{
            System.out.print(max);
        }
    }
}
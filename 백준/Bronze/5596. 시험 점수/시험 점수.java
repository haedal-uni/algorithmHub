import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int sum = 0;
        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            if(max<sum){
                max = sum;
            }
            sum = 0;
        }
        System.out.println(max);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0;
        int max = 0;
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            if(sum>max){
                max = sum;
                num = i+1;
            }
            sum = 0;
        }
        System.out.println(num + " " + max);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int x = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<3; i++){
            x = Integer.parseInt(st.nextToken());
            if(x>n){
                sum+=n;
            }else{
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}
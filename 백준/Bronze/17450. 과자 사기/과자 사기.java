import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float max = 0;
        int x = 0;
        int y = 0;
        float z = 0;
        int n = 0;
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = x*10;
            if(z>=5000){
                z-=500;
            }
            z=(y*10)/z;
            if(z>max){
                max = z;
                n=i;
            }
        }
        if(n==0){
            System.out.print("S");
        }else if(n==1){
            System.out.print("N");
        }else{
            System.out.print("U");
        }
    }
}
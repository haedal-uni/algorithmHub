import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int zero = 0;
        int one = 0;
        for(int i=0; i<h; i++){
            String[] x = br.readLine().split("");
            for(int j=0; j<w; j++){
                if(x[j].equals("0")){
                    zero++;
                }else{
                    one++;
                }
            }
        }
        System.out.print(Math.min(zero, one));
    }
}
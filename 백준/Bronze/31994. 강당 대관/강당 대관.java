import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = "";
        String y = "";
        int max = 0;
        int z = 0;
        for(int i=0; i<7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = st.nextToken();
            z = Integer.parseInt(st.nextToken());
            if(max<z){
                max = z;
                y = x;
            }
        }
        System.out.print(y);
    }
}
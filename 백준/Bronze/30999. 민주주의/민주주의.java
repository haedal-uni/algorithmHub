import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i=0; i<n; i++){
            String x = br.readLine();
            String y = x.replaceAll("O","");
            if(x.length()-y.length()>=(m/2)+1){
                count++;
            }
        }
        System.out.print(count);
    }
}
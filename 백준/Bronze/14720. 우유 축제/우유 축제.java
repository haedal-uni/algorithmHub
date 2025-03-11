import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] x = {"0","1","2"};
        for(int i=0; i<n; i++){
            if(st.nextToken().equals(x[num])){
                num++;
                count++;
            }
            if(num>2){
                num=0;
            }
        }
        System.out.print(count);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(),"D-");
            if(Integer.parseInt(st.nextToken())<=90){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
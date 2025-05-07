import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            if(Integer.parseInt(st.nextToken())<=h){
                count++;
            }
        }
        System.out.print(count);
    }
}
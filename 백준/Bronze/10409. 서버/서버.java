import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            t-=Integer.parseInt(st.nextToken());
            if(t>=0){
                count++;
            }else{
                break;
            }
        }
        System.out.print(count);
    }
}
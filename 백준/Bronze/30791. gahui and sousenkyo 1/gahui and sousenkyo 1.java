import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int max = Integer.parseInt(st.nextToken());
        for(int i=0; i<4; i++){
            if(max-1000<=Integer.parseInt(st.nextToken())){
                count++;
            }
        }
        System.out.print(count);
    }
}
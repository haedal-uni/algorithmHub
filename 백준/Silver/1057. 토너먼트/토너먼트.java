import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        st.nextToken();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int count = 0;
        while (x!=y){
            x = x/2+x%2;
            y = y/2+y%2;
            count++;
        }
        System.out.println(count);
    }
}
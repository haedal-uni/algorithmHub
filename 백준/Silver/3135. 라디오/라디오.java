import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int min = Math.abs(a-b);
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            min = Math.min(Math.abs(b-x)+1, min);
        }
        System.out.println(min);
    }
}
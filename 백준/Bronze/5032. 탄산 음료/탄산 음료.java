import java.io.*;
import java.util.*;
public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int x = (e+f)/c;
        int y = (e+f)%c;
        int z = 0;
        int ans = x;
        while (x+y>=c){
            z = (x+y)/c;
            y = (x+y)%c;
            x=z;
            ans+=x;
        }
        System.out.print(ans);
    }
}
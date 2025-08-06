import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(st.nextToken());
        String c = st.nextToken();
        int sum = 0;
        for(int i=a; i<b+1; i++){
            sum+= (i+"").length()-(i+"").replaceAll(c,"").length();
        }
        System.out.print(sum);
    }
}
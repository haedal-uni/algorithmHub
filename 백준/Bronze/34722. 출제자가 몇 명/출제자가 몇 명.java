import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            boolean qualified = false;
            if (s>=1000) qualified = true;
            else if (c>=1600) qualified = true;
            else if (a>=1500) qualified = true;
            else if (r!=-1 && r<=30) qualified = true;
            if (qualified) count++;
        }
        System.out.print(count);
    }
}
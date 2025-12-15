import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int cityStart = a+1;
        int cityEnd = b-1;
        int left = Math.min(s, t);
        int right = Math.max(s, t);
        boolean flag1 = (s>=cityStart && s<=cityEnd);
        boolean flag2 = (t>=cityStart && t<=cityEnd);
        if (flag1 && flag2) {
            System.out.print("City");
            return;
        }
        boolean pass_c = !(right<cityStart || left>cityEnd);
        if (!flag1 && !flag2 && !pass_c) {
            System.out.print("Outside");
        } else {
            System.out.print("Full");
        }
    }
}
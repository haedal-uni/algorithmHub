import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        st.nextToken();
        int num = -1;
        boolean flag;
        for(int i=0; i<h; i++) {
            String[] x = br.readLine().split("");
            num = -1;
            flag = false;
            for(String s : x) {
                if(s.equals("c")) {
                    num = 0;
                    flag = true;
                    sb.append(num).append(" ");
                    num++;
                } else if(flag) {
                    sb.append(num).append(" ");
                    num++;
                } else{
                    sb.append(num).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
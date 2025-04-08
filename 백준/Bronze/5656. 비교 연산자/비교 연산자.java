import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        int i = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            if(s.equals("E")) break;
            y = Integer.parseInt(st.nextToken());
            sb.append("Case ").append(i).append(": ");
            switch (s){
                case ">":
                    sb.append(x>y).append("\n");
                    break;
                case "<":
                    sb.append(x<y).append("\n");
                    break;
                case ">=":
                    sb.append(x>=y).append("\n");
                    break;
                case "<=":
                    sb.append(x<=y).append("\n");
                    break;
                case "!=":
                     sb.append(x!=y).append("\n");
                     break;
                case "==":
                    sb.append(x==y).append("\n");
                    break;
            }
            i++;
        }
        System.out.print(sb);
    }
}
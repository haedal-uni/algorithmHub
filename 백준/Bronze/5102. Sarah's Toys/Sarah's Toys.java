import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;
        int z = 0;
        StringBuilder sb = new StringBuilder();
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x == 0 && y == 0){
                break;
            }
            z = x-y;
            x=z/2;
            if(z/2>=1&z%2==1){
                x-=1;
                y=1;
            }else{
                y=0;
            }
            sb.append(x).append(" ").append(y).append("\n");
        }
        System.out.print(sb);
    }
}
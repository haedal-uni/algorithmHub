import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        StringBuilder stb = new StringBuilder();
        int x = 0;
        int y = 0;
        while (true){
            st = new StringTokenizer(br.readLine());
            stb.append(st.nextToken());
            if(stb.toString().equals("#")){
                break;
            }
            sb.append(stb).append(" ");
            stb.delete(0, stb.length());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x>17||y>=80){
                sb.append("Senior").append("\n");
            }else{
                sb.append("Junior").append("\n");
            }
        }
        System.out.print(sb);
    }
}
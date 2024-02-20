import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() ," ");
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] xy = new int[x][y];
        String[] ans;
        for(int i=0; i<x; i++){
            ans = br.readLine().split(" ");
            for(int j=0; j<y; j++){
                xy[i][j] = Integer.parseInt(ans[j]);
            }
        }
        for(int i=0; i<x; i++){
            ans = br.readLine().split(" ");
            for(int j=0; j<y; j++){
                sb.append(xy[i][j]+Integer.parseInt(ans[j])).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
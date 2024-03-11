import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        int[][] y = new int[15][15];
        int k = 0;
        int n=0;
        for(int i=0; i<15; i++){
            y[0][i] = i;
            y[i][1] = 1;
        }
        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                y[i][j] = y[i-1][j]+y[i][j-1];
            }
        }
        for(int i=0; i<x; i++){
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            sb.append(y[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
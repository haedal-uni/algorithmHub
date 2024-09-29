import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int t = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            for(int j=1; j<x+1; j++){
                t+=j*(j+1)*(j+2)/2;
            }
            sb.append(t).append("\n");
            t=0;
        }
        System.out.println(sb);
    }
}
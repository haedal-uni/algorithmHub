import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] x = new int[5];
        int y = 0;
        int count = 0;
        for(int i=0; i<5; i++){
            y = Integer.parseInt(br.readLine());
            x[i] = y;
            count+=y;
        }
        Arrays.sort(x);
        sb.append(count/5).append("\n");
        sb.append(x[2]);
        System.out.println(sb);
    }
}
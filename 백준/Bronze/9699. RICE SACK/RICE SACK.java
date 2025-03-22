import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int x = 0;
        for(int i=1; i<n+1; i++){
            sb.append("Case #").append(i).append(": ");
            max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                x = Integer.parseInt(st.nextToken());
                if(x>max){
                    max = x;
                }
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}
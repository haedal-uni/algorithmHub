import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i=0;i<n;i++){
            String[] s = br.readLine().split("");
            for(int j=0;j<m;j++){
                if(s[j].equals("+")){
                    count++;
                    break;
                }
                if(s[j].equals(".")){
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
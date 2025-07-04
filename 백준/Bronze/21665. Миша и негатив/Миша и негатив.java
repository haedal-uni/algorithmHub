import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][m];
        int count = 0;
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<m; j++){
                arr[i][j] = str[j];
            }
        }
        br.readLine();
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<m; j++){
                if(arr[i][j].equals(str[j])){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
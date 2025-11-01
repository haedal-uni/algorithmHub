import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++){
            String a = st.nextToken();
            for(int j=0; j<n; j++){
                if(s[j].equals(a)){
                   s[j]="";
                }
            }
        }
        for(int i=0; i<n; i++){
            if(!s[i].isEmpty()){
                System.out.print(s[i]);
            }
        }
    }
}
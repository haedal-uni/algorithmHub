import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int count=0;
        for(int i=0; i<n; i++) {
            if(Integer.parseInt(st.nextToken())>0){
                count++;
            }
        }
        System.out.print(count);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String x = "";
        int cnt = 1;
        int sum = 0;
        for(int i=0; i<n; i++){
            x = st.nextToken();
            if(x.equals("1")){
                sum+=cnt;
                cnt++;
            }
            if(x.equals("0")){
                cnt=1;
            }
        }
        System.out.println(sum);
    }
}
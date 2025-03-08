import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        float ans = 0;
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int total = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            x = Integer.parseInt(st.nextToken());
            total+=x;
            String s = st.nextToken();
            sum=0;
            if(s.charAt(0)!='F'){
                sum += 69 - s.charAt(0);
                if(s.length()>1){
                    if(s.charAt(1)=='+'){
                        sum+= 0.3F;
                    }else if(s.charAt(1)=='-'){
                        sum-=0.3F;
                    }
                }
            }
            ans+=sum*x;
        }
        System.out.printf("%.2f", ans/total);
    }
}
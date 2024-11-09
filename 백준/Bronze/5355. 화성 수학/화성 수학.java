import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        double x=0.0;
        String y = "";
        int z = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            z = st.countTokens();
            x = Double.parseDouble(st.nextToken());
            for(int j=0; j<z-1; j++){
                y = st.nextToken();
                if(y.equals("@")){
                    x*=3;
                }else if(y.equals("%")){
                    x+=5;
                }else{
                    x-=7;
                }
            }
            System.out.printf("%.2f\n",x);
        }
    }
}
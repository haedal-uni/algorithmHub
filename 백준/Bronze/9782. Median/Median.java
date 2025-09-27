import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double x = 0.0;
        int j =1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n==0){
                break;
            }
            sb.append("Case ").append(j).append(": ");
            if(n%2==0){
                for(int i=0;i<(n/2)-1;i++){
                    st.nextToken();
                }
                x=(Double.parseDouble(st.nextToken())+Double.parseDouble(st.nextToken()))/2;
                sb.append(x).append("\n");
            }else{
                for(int i=0; i<n/2; i++){
                    st.nextToken();
                }
                x = Double.parseDouble(st.nextToken());
                sb.append(x).append("\n");
            }
            j++;
        }
        System.out.print(sb);
    }
}
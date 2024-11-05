import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String[] x = {"C", "B", "A", "E"};
        int sum = 0;
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<4; j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            if(sum==0){
                sb.append("D").append("\n");
            }else{
                sb.append(x[sum-1]).append("\n");
            }
            sum=0;
        }
        System.out.print(sb);
    }
}
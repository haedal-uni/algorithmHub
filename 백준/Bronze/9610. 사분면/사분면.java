import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x==0 || y==0){
                axis++;
            }else if(x>0){
                if(y>0){
                    q1++;
                }else{
                    q4++;
                }
            }else{
                if(y>0){
                    q2++;
                }else{
                    q3++;
                }
            }
        }
        sb.append("Q1: ").append(q1).append("\n");
        sb.append("Q2: ").append(q2).append("\n");
        sb.append("Q3: ").append(q3).append("\n");
        sb.append("Q4: ").append(q4).append("\n");
        sb.append("AXIS: ").append(axis);
        System.out.print(sb);
    }
}
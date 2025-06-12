import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        double[] a = {9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193};
        double[] b = {26.7, 75, 1.5, 42.5, 210, 3.8, 254};
        double[] c = {1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88};
        int score = 0;
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            score = 0;
            for(int j=0; j<7; j++){
                if(j%3==0){
                    score += (int) (a[j]*Math.pow(b[j]-Integer.parseInt(st.nextToken()), c[j]));
                }else{
                    score += (int) (a[j] * Math.pow(Integer.parseInt(st.nextToken())-b[j], c[j]));
                }
            }
            sb.append(score).append("\n");
        }
        System.out.print(sb);
    }
}
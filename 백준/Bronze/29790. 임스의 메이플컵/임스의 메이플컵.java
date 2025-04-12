import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int u = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        if(n>=1000){
            if(u>=8000||l>=260){
                System.out.print("Very Good");
            }else{
                System.out.print("Good");
            }
        }else{
            System.out.print("Bad");
        }
    }
}
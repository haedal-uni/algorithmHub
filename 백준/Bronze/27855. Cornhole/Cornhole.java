import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(i==0){
                a = Integer.parseInt(st.nextToken())*3+Integer.parseInt(st.nextToken());
            }else{
                b = Integer.parseInt(st.nextToken())*3+Integer.parseInt(st.nextToken());
            }
        }
        if(a==b){
            System.out.print("NO SCORE");
        }else if(a>b){
            System.out.print(1 + " " + (a-b));
        }else{
            System.out.print(2 + " " + (b-a));
        }
    }
}
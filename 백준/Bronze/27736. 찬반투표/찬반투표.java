import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = 0;
        int x = 0;
        int a = 0;
        int b = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(st.nextToken());
            if(x==0){
                m++;
            }else if(x==1){
                a++;
            }else{
                b++;
            }
        }
        if(m*2>=n){
            System.out.print("INVALID");
        }else if(a>b){
            System.out.print("APPROVED");
        }else{
            System.out.print("REJECTED");
        }
    }
}
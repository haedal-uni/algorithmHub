import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int a=0;
        int b=0;
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            total-= a*b;
        }
        if(total==0){
            sb.append("Yes");
        }else{
            sb.append("No");
        }
        System.out.print(sb);
    }
}
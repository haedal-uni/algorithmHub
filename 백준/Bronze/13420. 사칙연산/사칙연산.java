import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(br.readLine());
        long x = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Long.parseLong(st.nextToken());
            String s = st.nextToken();
            switch(s){
                case "+":
                    x+=Long.parseLong(st.nextToken());
                    break;
                case "-":
                    x-=Long.parseLong(st.nextToken());
                    break;
                case "*":
                    x*=Long.parseLong(st.nextToken());
                    break;
                case "/":
                    x/=Long.parseLong(st.nextToken());
                    break;
            }
            st.nextToken();
            if(x==Long.parseLong(st.nextToken())){
                sb.append("correct").append("\n");
            }else{
                sb.append("wrong answer").append("\n");
            }
        }
        System.out.print(sb);
    }
}
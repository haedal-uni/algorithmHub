import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int sum = 0;
        boolean flag = false;
        for(int i=0; i<n; i++){
            sum = 0;
            flag = false;
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken()).append(" ");
            for(int j=0; j<3; j++){
                x = Integer.parseInt(st.nextToken());
                sum+=x;
                if(j==0){
                    if(x<35*0.3){
                        flag = true;
                    }
                }
                if(j==1){
                    if(x<25*0.3){
                        flag = true;
                    }
                }
                if(j==2){
                    if(x<40*0.3){
                        flag = true;
                    }
                }
            }
            sb.append(sum).append(" ");
            if(!flag){
                if(sum>=55){
                    sb.append("PASS").append("\n");
                }else{
                    sb.append("FAIL").append("\n");
                }
            }else{
                sb.append("FAIL").append("\n");
            }
        }
        System.out.print(sb);
    }
}
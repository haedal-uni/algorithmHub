import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            if(x%2==0){
                sb.append(x).append(" is even").append("\n");
            }else{
                sb.append(x).append(" is odd").append("\n");
            }
        }
        System.out.print(sb);
    }
}
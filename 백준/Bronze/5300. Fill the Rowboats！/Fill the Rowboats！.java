import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = n/6;
        int a = 1;
        for(int i=1; i<m+1; i++) {
            for(int j=0; j<6; j++) {
                sb.append(a).append(" ");
                a++;
            }
            sb.append("Go!").append(" ");
        }
        if(a-1!=n){
            for(int i=a; i<=n; i++){
                sb.append(i).append(" ");
            }
            sb.append("Go!");
        }
        System.out.print(sb);
    }
}
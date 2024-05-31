import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 0;
        int sum = 0;
        while (true){
            n = Integer.parseInt(br.readLine());
            if(n==0){
                break;
            }
            for(int i=n; i>0; i--){
               sum+=i;
            }
            sb.append(sum).append("\n");
            sum = 0;
        }
        System.out.println(sb);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        StringBuilder sb = new StringBuilder();
        while (true){
            x = Integer.parseInt(br.readLine());
            if(x==0){
                break;
            }
            if(x%n==0){
                sb.append(x).append(" is a multiple of ").append(n).append(".").append("\n");
            }else{
                sb.append(x).append(" is NOT a multiple of ").append(n).append(".").append("\n");
            }
        }
        System.out.println(sb);
    }
}
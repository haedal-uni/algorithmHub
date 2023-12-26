import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i=1; i<num+1; i++) {
            if(i==num){
                sb.append("*".repeat(i));
            }else{
                sb.append("*".repeat(i)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
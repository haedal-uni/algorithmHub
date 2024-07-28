import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        x = x*5-400;
        sb.append(x).append("\n");
        if(x>100){
            sb.append(-1);
        }else if(x==100){
            sb.append(0);
        }else{
            sb.append(1);
        }
        System.out.println(sb);
    }
}
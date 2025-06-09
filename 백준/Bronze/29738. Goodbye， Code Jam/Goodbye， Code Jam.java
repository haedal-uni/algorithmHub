import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=1; i<=t; i++){
            x = Integer.parseInt(br.readLine());
            sb.append("Case #").append(i).append(": ");
            if(x<=25){
                sb.append("World Finals").append("\n");
            }else if(x<=1000){
                sb.append("Round 3").append("\n");
            }else if(x<=4500){
                sb.append("Round 2").append("\n");
            }else{
                sb.append("Round 1").append("\n");
            }
        }
        System.out.print(sb);
    }
}
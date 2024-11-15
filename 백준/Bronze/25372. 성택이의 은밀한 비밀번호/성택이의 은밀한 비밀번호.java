import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=0; i<n; i++) {
            x = br.readLine().length();
            if(x>5&&x<10){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
        }
        System.out.print(sb);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String x = "";
        while (true){
            x = br.readLine();
            if(x==null){
                break;
            }
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }
}
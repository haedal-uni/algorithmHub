import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<n+1; i++){
            sb.append("Hello World, Judge ").append(i).append("!").append("\n");
        }
        System.out.print(sb);
    }
}
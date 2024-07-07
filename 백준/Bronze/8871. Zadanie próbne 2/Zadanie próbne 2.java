import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())+1;
        StringBuilder sb = new StringBuilder();
        sb.append(n*2).append(" ").append(n*3);
        System.out.println(sb);
    }
}
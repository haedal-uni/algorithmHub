import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.parseInt(a)+Integer.parseInt(b)-c).append("\n");
        sb.append(Integer.parseInt(a+b)-c);
        System.out.println(sb);
    }
}
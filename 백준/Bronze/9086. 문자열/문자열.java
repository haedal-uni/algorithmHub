import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String y;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<x; i++){
            y = br.readLine();
            sb.append(y.split("")[0]).append(y.split("")[y.length()-1]).append("\n");
        }
        System.out.println(sb);
    }
}
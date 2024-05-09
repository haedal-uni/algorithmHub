import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i=0; i<4; i++){
            count+= Integer.parseInt(br.readLine());
        }
        sb.append(count/60).append("\n").append(count%60);
        System.out.println(sb);
    }
}
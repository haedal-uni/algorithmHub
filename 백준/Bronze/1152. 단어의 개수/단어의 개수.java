import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String x = br.readLine().strip();
        if(!x.isEmpty()){
            String[] y = x.split(" ");
            answer = y.length;
        }
        System.out.println(answer);
    }
}
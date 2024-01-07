import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder x = sb.append(br.readLine());
        String y = x.toString();
        String z = x.reverse().toString();
        int answer = 0;
        if(y.equals(z)){
            answer = 1;
        }
        System.out.println(answer);
    }
}
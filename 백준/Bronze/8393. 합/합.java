import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=1; i<num+1; i++){
            answer+=i;
        }
        System.out.print(answer);
    }
}
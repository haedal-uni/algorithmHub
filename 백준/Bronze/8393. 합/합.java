import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = num;
        for(int i=1; i<num; i++){
            answer+=i;
        }
        System.out.print(answer);
    }
}
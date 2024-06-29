import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int sum = 0;
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n==-1){
                break;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int x = 0;
        for(int i=0; i<5; i++){
            x = Integer.parseInt(br.readLine());
            if(x<40){
                x=40;
            }
            sum+=x;
        }
        System.out.println(sum/5);
    }
}
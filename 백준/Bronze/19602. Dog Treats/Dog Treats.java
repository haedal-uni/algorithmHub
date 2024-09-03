import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        s = s+2*m+3*l;
        if(s>=10){
            System.out.println("happy");
        }else{
            System.out.println("sad");
        }
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        if(b+60>=a){
            sum+=a*1500;
        }else{
            sum+=(a-(b+60))*3000+(60+b)*1500;
        }
        System.out.println(sum);
    }
}
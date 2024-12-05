import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        if(x.contains("F")){
            System.out.print(0.0);
        }else{
            double a = 4.0;
            if(x.charAt(1)=='+'){
                a+=0.3F;
            }else if(x.charAt(1)=='-'){
                a-=0.3F;
            }
            a-=((int) x.charAt(0)-65);
            System.out.printf("%.1f",a);
        }
    }
}
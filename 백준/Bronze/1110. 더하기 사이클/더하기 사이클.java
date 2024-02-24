import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int count = 0;
        String z = "";
        int a = 0;
        int b = 0;
        String c = "";
        if (Integer.parseInt(x) < 10) {
            x = x + "0";
        }
        z = x;
        while (true) {
            a = Integer.parseInt(x.split("")[0]);
            b = Integer.parseInt(x.split("")[1]);
            c = a+b+"";
            if(a+b>9){
                x = b + c.split("")[1];
            }else{
                x = b + c;
            }
            count++;
            if (x.equals(z)) {
                break;
            }
        }
        System.out.println(count);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        if(!x.contains("X")){
            System.out.print(x);
        }else{
            String a = "AAAA";
            String b = "BB";
            x = x.replaceAll("XXXX",a);
            x = x.replaceAll("XX",b);
            if(x.contains("X")){
                System.out.print(-1);
            }else{
                System.out.print(x);
            }
        }
    }
}
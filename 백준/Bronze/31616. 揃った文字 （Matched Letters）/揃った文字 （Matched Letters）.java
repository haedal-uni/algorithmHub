import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String x = br.readLine();
        String y = x.split("")[0];
        x = x.replaceAll(y,"");
        if(!x.isEmpty()){
            System.out.print("No");
        }else {
            System.out.print("Yes");
        }
    }
}
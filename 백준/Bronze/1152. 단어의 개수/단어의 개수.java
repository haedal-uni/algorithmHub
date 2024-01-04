import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine().strip();
        if(x.replace(" ","").length()==0){
            System.out.println("0");
        }else {
            String[] y = x.split(" ");
            System.out.println(y.length);
        }
    }
}
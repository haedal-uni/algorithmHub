import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        if(a.contains(b)) {
            System.out.print("go");
        }else{
            System.out.print("no");
        }
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (true) {
            String s = br.readLine();
            if(s==null) break;
            if(!s.isEmpty()){
                n++;
            }
        }
        System.out.print(n);
    }
}
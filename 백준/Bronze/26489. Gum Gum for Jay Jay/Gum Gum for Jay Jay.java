import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true){
            String line = br.readLine();
            if(line==null) break;
            if(line.equals("gum gum for jay jay")){
                count++;
            }
        }
        System.out.print(count);
    }
}
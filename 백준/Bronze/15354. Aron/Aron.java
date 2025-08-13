import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = 2;
        int n = Integer.parseInt(br.readLine());
        String x = br.readLine();
        for(int i=0; i<n-1; i++){
            String y = br.readLine();
            if(!x.equals(y)){
                line++;
            }
            x = y;
        }
        System.out.print(line);
    }
}
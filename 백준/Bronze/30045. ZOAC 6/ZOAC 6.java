import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<n; i++){
            String s = br.readLine();
            if(s.contains("01") || s.contains("OI")){
                count++;
            }
        }
        System.out.print(count);
    }
}
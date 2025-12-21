import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String x = br.readLine();
        int count = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)!=x.charAt(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}
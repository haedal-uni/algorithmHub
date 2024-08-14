import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String x = "";
        long sum = 0L;
        for(int i=0;i<n; i++){
            x = br.readLine();
            sum+= (long) Math.pow(Integer.parseInt(x.substring(0,x.length()-1)),Integer.parseInt(String.valueOf(x.charAt(x.length()-1))));
        }
        System.out.println(sum);
    }
}
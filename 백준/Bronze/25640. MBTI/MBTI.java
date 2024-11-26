import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<n; i++){
            if(x.equals(br.readLine())){
                sum++;
            }
        }
        System.out.print(sum);
    }
}
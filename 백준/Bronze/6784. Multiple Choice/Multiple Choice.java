import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = new String[n];
        int count = 0;
        for(int i=0; i<n; i++){
            x[i] = br.readLine();
        }
        for(int i=0; i<n; i++){
            if(x[i].equals(br.readLine())){
                count++;
            }
        }
        System.out.print(count);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int x = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            if(x%2!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}
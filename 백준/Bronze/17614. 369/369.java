import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int x = 0;
        for(int i=1; i<n+1; i++) {
            x = i;
            while(x>0) {
                if(x%10==3||x%10==6||x%10==9){
                    sum++;
                }
                x/=10;
            }
        }
        System.out.print(sum);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int min = 64;
        int z = 0;
        int count = 1;
        int sum = 64;
        while (sum>x){
            z = min/2;
            count++;
            sum-=z;
            if(x<=sum){
                count--;
            }else{
                sum+=z;
            }
            min /= 2;
        }
        System.out.println(count);
    }
}
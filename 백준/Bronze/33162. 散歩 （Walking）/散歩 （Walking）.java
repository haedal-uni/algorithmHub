import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=3;
            }else{
                sum-=2;
            }
        }
        System.out.print(sum);
    }
}
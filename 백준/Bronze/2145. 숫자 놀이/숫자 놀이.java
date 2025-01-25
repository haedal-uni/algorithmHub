import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (true) {
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                break;
            }
            while (x>0){
                sum+=x%10;
                x=x/10;
                if(x<=0&&sum>9){
                    x = sum;
                    sum = 0;
                }
            }
            sb.append(sum).append("\n");
            sum=0;
        }
        System.out.print(sb);
    }
}
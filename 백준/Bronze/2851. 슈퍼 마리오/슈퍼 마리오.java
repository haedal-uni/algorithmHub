import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i=0; i<10; i++){
            x = Integer.parseInt(br.readLine());
            sum+=x;
            if(sum>=100){
                y=sum-x;
                x=Math.abs(y-100);
                z=Math.abs(sum-100);
                if(x<z){
                    System.out.print(y);
                    break;
                }else {
                    System.out.print(sum);
                    break;
                }
            }
        }
        if(sum<100){
            System.out.print(sum);
        }
    }
}
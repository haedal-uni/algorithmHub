import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int min = 101;
        int sum = 0;
        for(int i=0; i<7; i++){
            x = Integer.parseInt(br.readLine());
            if(x%2==1){
                sum+=x;
                if(min>x){
                    min = x;
                }
            }
        }
        sb.append(sum).append("\n").append(min);
        if(min==101){
            System.out.println(-1);
        }else{
            System.out.println(sb);
        }
    }
}
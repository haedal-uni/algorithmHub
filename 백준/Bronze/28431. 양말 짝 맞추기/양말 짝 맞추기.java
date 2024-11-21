import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        for(int i=0; i<5; i++){
            y = Integer.parseInt(br.readLine());
            if(sb.toString().contains(y+"")){
                x-=y;
                sb = new StringBuilder(sb.toString().replace(y+"",""));
            }else{
                x+=y;
                sb.append(y);
            }
        }
        System.out.print(x);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int y = 0;
        boolean flag = false;
        for(int i=1; i<n; i++){
            y = Integer.parseInt(br.readLine());
            if(x<y){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.print("N");
        }else{
            System.out.print("S");
        }
    }
}
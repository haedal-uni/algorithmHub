import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x=0;
        int y=0;
        for(int i=0; i<n; i++){
            if(br.readLine().equals("D")){
                x++;
            }else{
                y++;
            }
            if(Math.abs(x-y)>=2){
                break;
            }
        }
        System.out.print(x + ":" + y);
    }
}
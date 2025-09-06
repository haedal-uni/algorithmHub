import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 1500;
        for(int i=0; i<4; i++){
            x-=Integer.parseInt(br.readLine());
        }
        if(x>=0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
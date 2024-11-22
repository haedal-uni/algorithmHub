import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int win = 0;
        String[] x = br.readLine().split(" ");
        String[] y = br.readLine().split(" ");
        for(int i=0; i<9; i++){
            win+=Integer.parseInt(x[i]);
            if(win>0){
                System.out.print("Yes");
                return;
            }
            win-=Integer.parseInt(y[i]);

        }
        System.out.print("No");
    }
}
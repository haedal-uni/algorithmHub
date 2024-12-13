import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split("");
        int x = n.length/2;
        int a = 0;
        int b = 0;
        for(int i=0; i<n.length; i++){
            if(i>=x){
                b+=Integer.parseInt(n[i]);
            }else{
                a+=Integer.parseInt(n[i]);
            }
        }
        if(a==b){
            System.out.print("LUCKY");
        }else{
            System.out.print("READY");
        }
    }
}
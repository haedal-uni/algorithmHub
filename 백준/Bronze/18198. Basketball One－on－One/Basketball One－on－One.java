import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int a = 0;
        int b = 0;
        int diff=1;
        for(int i=0; i<x.length; i+=2){
            if(x[i].equals("A")){
                a+=Integer.parseInt(x[i+1]);
            }else{
                b+=Integer.parseInt(x[i+1]);
            }
            if(a==10&&b==10){
                diff=2;
            }
            if((a>=11 || b>=11) && Math.abs(a-b)>=diff){
                if(a>b){
                    System.out.print("A");
                }else{
                    System.out.print("B");
                }
                break;
            }
        }
    }
}
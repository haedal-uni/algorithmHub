import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        int n = Integer.parseInt(x);
        int num = 0;
        while(true) {
            for(int i=0; i<x.length(); i++) {
                num+=Integer.parseInt(x.charAt(i)+"");
            }
            if(n%num==0){
                System.out.print(n);
                break;
            }else{
                n++;
                x=n+"";
                num=0;
            }
        }
    }
}
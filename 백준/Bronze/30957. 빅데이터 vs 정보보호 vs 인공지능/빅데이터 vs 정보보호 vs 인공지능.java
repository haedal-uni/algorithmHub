import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split("");
        int s = 0;
        int b = 0;
        int a = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(x[i].equals("A")){
                a++;
            }else if(x[i].equals("B")){
                b++;
            }else if(x[i].equals("S")){
                s++;
            }
        }
        max = Math.max(a, Math.max(b, s));
        if(max==a && max==b && max==s){
            System.out.print("SCU");
        }else if(max==a && max==b){
            System.out.print("BA");
        }else if(max==a && max==s){
            System.out.println("SA");
        }else if(max==s && max==b){
            System.out.print("BS");
        }else if(max==a){
            System.out.print("A");
        }else if(max==b){
            System.out.print("B");
        }else{
            System.out.print("S");
        }
    }
}
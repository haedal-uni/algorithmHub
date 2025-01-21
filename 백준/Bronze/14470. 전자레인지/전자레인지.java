import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int time = 0;
        if(a<0){
            time+=-a*c;
            a=0;
        }
        if(a==0){
            time += d;
        }
        if(a>=0){
            time+=(b-a)*e;
        }
        System.out.print(time);
    }
}
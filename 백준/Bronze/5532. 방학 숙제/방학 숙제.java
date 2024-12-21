import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        System.out.print(l-Math.max(x(a,c),x(b,d)));
    }

    public static int x(int a, int b){
        int sum = a/b;
        if(a%b!=0){
            sum+=1;
        }
        return sum;
    }
}
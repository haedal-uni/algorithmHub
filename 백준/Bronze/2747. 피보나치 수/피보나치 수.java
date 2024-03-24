import java.io.*;
public class Main {
    static int a = 0;
    static int b = 1;
    static int c = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int n = Integer.parseInt(br.readLine());
        if(n<2){
            ans = n;
        }else {
            ans = f(n);
        }
        System.out.println(ans);
    }
    public static int f(int n){
        c = a+b;
        for(int i=0; i<n/3; i++){
            a=b+c;
            b=c+a;
            c=a+b;
        }
        if(n%3==0){
            return a;
        }else if(n%3==1){
            return b;
        }else{
            return c;
        }
    }
}
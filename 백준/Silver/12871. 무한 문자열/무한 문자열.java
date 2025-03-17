import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String t = br.readLine();
        int n = lcm(s.length(), t.length());
        s=repeat(s, n);
        t=repeat(t, n);
        if(s.equals(t)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    public static String repeat(String str, int n){
        StringBuilder sb = new StringBuilder();
        while (sb.length()<n){
            sb.append(str);
        }
        return sb.toString();
    }
}
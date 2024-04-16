import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String[] arr1 = br.readLine().split(" ");
        int a1 = Integer.parseInt(arr[0]);
        int a2 = Integer.parseInt(arr[1]);
        int b1 = Integer.parseInt(arr1[0]);
        int b2 = Integer.parseInt(arr1[1]);

        long x = (long) a1 *b2+ (long) b1 *a2;
        long y = (long) a2 *b2;
        long z = f(x, y);
        System.out.println(x/z + " " + y/z);
    }
    public static long f(long x, long y){
        if(x%y==0){
            return y;
        }
        return f(y, x%y);
    }
}
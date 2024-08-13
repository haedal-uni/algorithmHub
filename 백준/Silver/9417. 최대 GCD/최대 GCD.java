import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr;
        long x = 0;
        long max = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            arr = br.readLine().split(" ");
            for(int j=0; j<arr.length-1; j++){
                for(int z=j+1; z<arr.length; z++){
                    x = gcd(Long.parseLong(arr[j]),Long.parseLong(arr[z]));
                    if(max<x){
                        max = x;
                    }
                }
            }
            sb.append(max).append("\n");
            max = 0;
            x = 0;
        }
        System.out.println(sb);
    }
    public static long gcd(long x, long y){
        if(x%y==0){
            return y;
        }
        return gcd(y,x%y);
    }
}
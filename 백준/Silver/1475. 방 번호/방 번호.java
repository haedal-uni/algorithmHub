import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int[] arr = new int[10];
        int num = 0;
        int a = 0;
        for (String s:x) {
            a = Integer.parseInt(s);
            if (a!=6 && a!=9) {
                arr[a]++;
            } else {
                num++;
            }
        }
        if(num%2==1){
            num=num/2+1;
        }else{
            num=num/2;
        }
        Arrays.sort(arr);
        System.out.print(Math.max(arr[9], num));
    }
}
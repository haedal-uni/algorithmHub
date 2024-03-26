import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");
        String[] y = br.readLine().split(" ");
        int[] a = new int[num];
        Integer[] b = new Integer[num];
        int sum = 0;
        for(int i=0; i<num; i++){
            a[i] = Integer.parseInt(x[i]);
            b[i] = Integer.parseInt(y[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for(int i=0; i<num; i++){
            sum+=a[i]*b[i];
        }
        System.out.println(sum);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int[] arr1 = new int[2];
        for(int i=0; i<4; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<2; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(arr[1]+arr[2]+arr[3]+arr1[1]);
    }
}
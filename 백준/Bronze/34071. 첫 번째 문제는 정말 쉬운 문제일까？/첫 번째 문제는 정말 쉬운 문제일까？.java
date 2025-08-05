import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[n-1];
        for(int i=0; i<n-1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        if(arr[0]>x){
            System.out.print("ez");
        }else if(arr[n-2]<x){
            System.out.print("hard");
        }else{
            System.out.print("?");
        }
    }
}
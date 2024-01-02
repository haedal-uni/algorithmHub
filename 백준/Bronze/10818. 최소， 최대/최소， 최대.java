import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String[] y = br.readLine().split(" ");
        int[] list = new int[x];
        for (int i=0; i<x; i++){
            list[i] = Integer.parseInt(y[i]);
        }
        Arrays.sort(list);
        System.out.print(list[0] + " " + list[list.length-1]);
    }
}
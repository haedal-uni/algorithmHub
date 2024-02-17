import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list =new ArrayList<>();
        int a = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int max = 0;
        double num = 0;
        int x = 0;
        for(int i=0; i<a; i++){
            x = Integer.parseInt(str[i]);
            list.add(x);
            if(max<x){
                max=x;
            }
        }
        for(int i=0; i<a; i++){
            num += list.get(i)*100.0/ max;
        }
        System.out.println(num/a);
    }
}
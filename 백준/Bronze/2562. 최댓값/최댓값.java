import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<9; i++){
            x = Integer.parseInt(br.readLine());
            list.add(x);
            if(y<x){
                y=x;
            }
        }
        System.out.println(y + "\n" + (list.indexOf(y)+1));
    }
}
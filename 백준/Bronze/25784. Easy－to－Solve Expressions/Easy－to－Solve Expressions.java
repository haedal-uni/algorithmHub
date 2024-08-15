import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : x) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        if(a+b==c){
            System.out.println(1);
        }else if(a*b==c){
            System.out.println(2);
        }else{
            System.out.println(3);
        }
    }
}
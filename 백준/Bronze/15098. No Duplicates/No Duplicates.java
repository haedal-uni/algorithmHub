import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(x));
        if(set.size()==x.length){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
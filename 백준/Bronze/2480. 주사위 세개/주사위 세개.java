import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arg = br.readLine().split(" ");
        Arrays.sort(arg);
        if(arg[0].equals(arg[1])){
            if(arg[1].equals(arg[2])){
                System.out.println(10000+Integer.parseInt(arg[0])*1000);
            }else{
                System.out.println(1000+Integer.parseInt(arg[0])*100);
            }
        }else{
            if(arg[1].equals(arg[2])){
                System.out.println(1000+Integer.parseInt(arg[1])*100);
            }else{
                System.out.println(Integer.parseInt(arg[2])*100);
            }
        }
    }
}
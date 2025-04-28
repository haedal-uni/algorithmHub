import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        char[] c = x.toCharArray();
        boolean flag = false;
        Arrays.sort(c);
        if(c[0]!=65){
            System.out.print("A");
        }else{
            for(int i=0; i< c.length; i++){
                if(c[i]-65!=i){
                    System.out.print((char) (c[i-1]+1));
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print("Z");
            }
        }
    }
}
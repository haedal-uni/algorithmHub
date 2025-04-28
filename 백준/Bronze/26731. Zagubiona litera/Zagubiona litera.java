import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        char[] c = x.toCharArray();
        Arrays.sort(c);
        if(c[0]!=65){
            System.out.print("A");
        }else if(c[c.length-1]!=90){
            System.out.print("Z");
        }else{
            for(int i=0; i<c.length; i++){
                if(c[i]-65!=i){
                    System.out.print((char) (c[i-1]+1));
                    break;
                }
            }

        }
    }
}
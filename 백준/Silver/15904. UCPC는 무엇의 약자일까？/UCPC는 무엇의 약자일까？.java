import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        String[] arr = {"U", "C", "P", "C"};
        int z = 0;
        for(int i=0; i<n; i++) {
            String[] x = st.nextToken().split("");
            for(String s : x) {
                if(z==4){
                    break;
                }
               if(s.charAt(0)<91){
                   if(arr[z].equals(s)){
                       z++;
                   }
               }
            }
        }
        if(z==4) {
            System.out.print("I love UCPC");
        }else{
            System.out.print("I hate UCPC");
        }
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one = 0;
        int two = 0;
        for(int i=0; i<3; i++){
            if(Integer.parseInt(st.nextToken()) == 1){
                one++;
            }else{
                two++;
            }
        }
        if(one>two){
            System.out.print(1);
        }else{
            System.out.print(2);
        }
    }
}
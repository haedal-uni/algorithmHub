import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = 0;
        int two = 0;
        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=3; j++){
                if(i==0){
                    one+=Integer.parseInt(st.nextToken())*j;
                }else{
                    two+=Integer.parseInt(st.nextToken())*j;
                }
            }
        }
        if(one>two){
            System.out.print(1);
        }else if(one==two){
            System.out.print(0);
        }else{
            System.out.print(2);
        }
    }
}
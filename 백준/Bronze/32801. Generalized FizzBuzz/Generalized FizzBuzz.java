import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int fizzBuzz = 0;
        int fizz = 0;
        int buzz = 0;
        for(int i=1; i<n+1; i++){
            if(i%a==0 && i%b==0){
                fizzBuzz++;
            }else if(i%a==0){
                fizz++;
            }else if(i%b==0){
                buzz++;
            }
        }
        System.out.print(fizz +" " + buzz + " " + fizzBuzz);
    }
}
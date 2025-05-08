import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int x = 0;
        int num = 0;
        int type = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            type = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());
            if(type==1){
                x+=num;
            }else if(type==2){
                if(x<num){
                    System.out.print("Adios");
                    return;
                }
                x-=num;
            }
        }
        System.out.print("See you next month");
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean x=false;
        int count = 0;
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x=false;
            for(int j=0; j<n; j++){
                if(st.nextToken().equals("7")){
                    x=true;
                }
            }
            if(!x){
                x=false;
                break;
            }
        }
        if(x){
            System.out.print("777");
        }else {
            System.out.print("0");
        }
    }
}
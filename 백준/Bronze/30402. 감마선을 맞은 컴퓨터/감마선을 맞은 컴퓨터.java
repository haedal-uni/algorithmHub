import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<15; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<15; j++){
                String x = st.nextToken();
                if(x.equals("w")){
                    System.out.print("chunbae");
                    return;
                }else if(x.equals("b")){
                    System.out.print("nabi");
                    return;
                }else if(x.equals("g")){
                    System.out.print("yeongcheol");
                    return;
                }
            }
        }
    }
}
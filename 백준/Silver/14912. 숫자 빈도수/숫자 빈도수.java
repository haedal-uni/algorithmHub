import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        String y = st.nextToken();
        int count = 0;
        String[] z;
        for(int i=1;i<x+1; i++){
            if((i+"").contains(y) && i>9){
                z = (i+"").split("");
                for(int j = 0; j< z.length; j++){
                    if(z[j].equals(y)){
                       count++;
                    }
                }
            }else if((i+"").contains(y)){
                count++;
            }
        }
        System.out.println(count);
    }
}
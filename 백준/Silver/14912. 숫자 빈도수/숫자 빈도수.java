import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = 0;
        int count = 0;
        for(int i=1; i<x+1; i++){
            z = i;
            while (z>0){
                if(z%10==y){
                    count++;
                }
                z/=10;
            }
        }
        System.out.println(count);
    }
}
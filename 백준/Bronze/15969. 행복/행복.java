import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int min = 1000;
        int max = 0;
        int x = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(st.nextToken());
            if(min>x){
                min = x;
            } else if (max<x) {
                max = x;
            }
        }
        System.out.println(max-min);
    }
}
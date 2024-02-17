import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        int c = 0;
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] list = new int[x+1];

        for(int i=1; i<x+1; i++){
            list[i] = i;
        }
        for(int i=0; i<y; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            while(a<b){
                c = list[a];
                list[a] = list[b];
                list[b] = c;
                a++;
                b--;
            }
        }
        for(int i=1; i<x+1;i++){
            sb.append(list[i] + " ");
        }
        System.out.println(sb);
    }
}
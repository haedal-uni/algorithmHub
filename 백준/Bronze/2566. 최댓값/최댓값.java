import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] st;
        List<String> list = new ArrayList<>();
        int max = 0;
        int[] x = {1, 1};
        for(int i=0; i<9; i++){
            st = br.readLine().split(" ");
            list.addAll(List.of(st));
            Arrays.sort(st);
            if(max<Integer.parseInt(st[8])){
                max = Integer.parseInt(st[8]);
                x[0] = i+1;
                x[1] = list.indexOf(st[8])+1-i*9;
            }
        }
        sb.append(max).append("\n").append(x[0]).append(" ").append(x[1]);
        System.out.println(sb);
    }
}
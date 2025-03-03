import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String[] x = br.readLine().toUpperCase().split("");
            Set<String> set = new HashSet<>();
            if(x[0].equals("#")){
                break;
            }
            for(String s : x) {
                if(s.charAt(0)>=65 && s.charAt(0)<=90) {
                    set.add(s);
                }
            }
            sb.append(set.size()).append("\n");
        }
        System.out.println(sb);
    }
}
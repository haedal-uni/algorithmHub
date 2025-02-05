import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            String x = br.readLine();
            Set<String> set = new HashSet<>(Arrays.asList(x.split("")));
            sb.append(set.size()).append("\n");
        }
        System.out.print(sb);
    }
}
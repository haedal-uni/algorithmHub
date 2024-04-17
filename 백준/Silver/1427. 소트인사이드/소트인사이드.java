import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(x, Collections.reverseOrder());
        for (String s : x) {
            sb.append(s);
        }
        System.out.println(sb);
    }
}
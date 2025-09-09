import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 4);
        map.put("e", 3);
        map.put("i", 1);
        map.put("o", 0);
        map.put("s", 5);
        String[] x = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        for (String s : x) {
            if (map.containsKey(s)) {
                sb.append(map.get(s));
            } else {
                sb.append(s);
            }
        }
        System.out.print(sb);
    }
}
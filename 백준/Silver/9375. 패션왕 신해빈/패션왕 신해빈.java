import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int y = Integer.parseInt(br.readLine());
            for (int j = 0; j < y; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String clo = st.nextToken();
                if (map.containsKey(clo)) {
                    map.put(clo, map.get(clo) + 1);
                } else {
                    map.put(clo, 1);
                }
            }
            int count = 1;
            for (int ans : map.values()) {
                count *= (ans+1);
            }
            sb.append(count - 1).append("\n");
        }
        System.out.println(sb);
    }
}
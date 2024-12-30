import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(),".");
            st.nextToken();
            String x = st.nextToken();
            if(!map.containsKey(x)) {
                map.put(x, 1);
            }else{
                map.put(x, map.get(x)+1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(String s : list) {
            sb.append(s).append(" ").append(map.get(s)).append("\n");
        }
        System.out.print(sb);
    }
}
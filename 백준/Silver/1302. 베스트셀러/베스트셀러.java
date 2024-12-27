import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            if(map.containsKey(s)) {
               map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }
            if(map.get(s)>max){
                max = map.get(s);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        String x = "z".repeat(51);
        for (String string : list) {
            if (map.get(string) == max) {
                if(string.compareTo(x)<0){
                    x = string;
                }
            }
        }
        System.out.print(x);
    }
}
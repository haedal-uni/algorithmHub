import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        map.put("Algorithm",204);
        map.put("DataAnalysis",207);
        map.put("ArtificialIntelligence",302);
        map.put("CyberSecurity",101);
        map.put("Network",303);
        map.put("Startup",501);
        map.put("TestStrategy",105);
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int x = map.get(br.readLine());
            if(x==101){
                sb.append("B").append(x).append("\n");
            }else{
                sb.append(x).append("\n");
            }
        }
        System.out.print(sb);
    }
}
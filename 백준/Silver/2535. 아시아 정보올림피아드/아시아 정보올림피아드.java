import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int student = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            map.put(score, country);
            map2.put(score, student);
        };
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        int i = n-1;
        int j = 0;
        while (j!=3) {
            int country = list.get(i).getValue();
            int score = list.get(i).getKey();
            int student = map2.get(score);
            if (i <= n-3 && arr[0] == arr[1] && arr[0] == country) { // 6
                i--;
              continue;
            }
            if(j<2){
                arr[j] = country;
            }
            sb.append(country).append(" ").append(student).append("\n");
            i--;
            j++;
        }
        System.out.print(sb);
    }
}
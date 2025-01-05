import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Map<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int key = 0;
        int value = 0;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            key = Integer.parseInt(st.nextToken());
            sb.append(st.nextToken()).append(st.nextToken()).append(st.nextToken());
            value = Integer.parseInt(sb.toString());
            map.put(key,value);
            sb.delete(0,sb.length());
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int rank = 0;
        boolean same = false;
        int count = 0;
        int x = 0;
        int y = 0;
        for(Map.Entry<Integer,Integer> entry : list) {
            x = entry.getValue();
            if(same){
                rank+=count;
                same = false;
                count=0;
            }
            if(x!=y){
                rank++;
            }else{
                same = true;
                count++;
            }
            y=x;
            if(entry.getKey()==k){
                break;
            }
        }
        System.out.print(rank);
    }
}
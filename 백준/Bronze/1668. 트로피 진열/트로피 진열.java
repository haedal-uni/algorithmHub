import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int y = 0;
        int cnt = 1;
        int sum = 1;
        list.add(x);
        for(int i=0; i<n-1; i++){
            y = Integer.parseInt(br.readLine());
            if(x<y){
                x = y;
                cnt++;
            }
            list.add(y);
        }
        Collections.reverse(list);
        x = list.get(0);
        for(int i=1; i<list.size(); i++){
            y = list.get(i);
            if(x<y){
                x = y;
                sum++;
            }
        }
        sb.append(cnt).append("\n").append(sum);
        System.out.print(sb);
    }
}
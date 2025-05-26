import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(br.readLine());
        }
        for(int i=0; i<m; i++){
            list1.add(br.readLine());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sb.append(list.get(i)).append(" as ").append(list1.get(j)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
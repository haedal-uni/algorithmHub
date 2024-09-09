import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        sb.append(list.get(7)+list.get(8)+list.get(9)).append(" ");
        list.clear();
        for(int i=0; i<10; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        sb.append(list.get(7)+list.get(8)+list.get(9)).append(" ");
        System.out.println(sb);
    }
}
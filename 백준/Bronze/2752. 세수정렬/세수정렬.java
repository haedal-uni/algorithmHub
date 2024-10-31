import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }
        System.out.print(sb);
    }
}
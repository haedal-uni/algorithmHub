import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list;
        int count = 0;
        while (true) {
            count = 0;
            list = Arrays.stream(br.readLine().split(" "))
                    .collect(Collectors.toList());
            if(list.get(0).equals("-1")) break;
            for(int i=0; i<list.size(); i++) {
                if(list.contains( (Integer.parseInt(list.get(i))*2)+"" ) && !list.get(i).equals("0")){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
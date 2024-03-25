import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int i = 1;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (true) {
            x = Integer.parseInt(br.readLine());
            if (x == -1) {
                break;
            }
            num.add(x);

            while (!list.contains(i)) {
                if (x % i == 0) {
                    list.add(i);
                    list.add(x / i);
                    count += i;
                    count += x / i;
                }
                i++;
            }
            if (count - x == x) {
                Collections.sort(list);
                sb.append(x).append(" = ").append(list.get(0));
                for (int j = 1; j < list.size() - 1; j++) {
                    sb.append(" + ").append(list.get(j));
                }
                sb.append("\n");
            } else {
                sb.append(x).append(" is NOT perfect.").append("\n");
            }
            list.clear();
            count = 0;
            i = 1;
        }
        System.out.println(sb);
    }
}
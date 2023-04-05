import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int r = 0;
        List<Integer> ls = new LinkedList<>();
        for (int i=1; i<N+1; i++){
            ls.add(i);
        }
        sb.append("<");
        while (N>1){
            r = (r+(k-1)) % N;
            N--;
            sb.append(ls.remove(r)).append(", ");
        }
        sb.append(ls.remove(0)).append(">");
        System.out.println(sb);
    }
}
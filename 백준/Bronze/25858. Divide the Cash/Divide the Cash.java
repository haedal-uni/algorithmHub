import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            sum+=x;
            list.add(x);
        }
        x = d/sum;
        for(int i=0; i<n; i++){
            sb.append(list.get(i)*x).append("\n");
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        String[] s = br.readLine().split("");
        for (int i = 0; i < 3; i++) {
            if (s[i].equals("A")) {
                sb.append(arr[0]).append(" ");
            } else if (s[i].equals("B")) {
                sb.append(arr[1]).append(" ");
            } else {
                sb.append(arr[2]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
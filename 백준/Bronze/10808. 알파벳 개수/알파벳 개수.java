import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for (String s:x) {
            arr[(int) s.charAt(0)-97]++;
        }
        for (int i:arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
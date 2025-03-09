import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        String a = br.readLine();
        String b = br.readLine();
        for (int i = 0; i < a.length(); i++) {
            sb.append(arr[a.charAt(i)-'A']);
            sb.append(arr[b.charAt(i)-'A']);
        }
        while (sb.length()>2) {
            String[] x = sb.toString().split("");
            sb.delete(0, sb.length());
            for(int i=0; i<x.length-1; i++) {
               sb.append((Integer.parseInt(x[i])+Integer.parseInt(x[i+1]))%10);
           }
        }
        System.out.print(sb);
    }
}
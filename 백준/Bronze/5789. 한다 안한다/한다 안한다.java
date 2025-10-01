import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t=0; t<n; t++) {
            String s = br.readLine();
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                left++;
                right--;
            }
            if (s.charAt(left) == s.charAt(right)) {
                sb.append("Do-it\n");
            } else {
                sb.append("Do-it-Not\n");
            }
        }
        System.out.print(sb);
    }
}
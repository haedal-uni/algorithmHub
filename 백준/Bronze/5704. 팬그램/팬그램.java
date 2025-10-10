import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s == null) break;
            if (s.equals("*")) break;
            s = s.replace(" ", "");
            if (s.length() < 26) {
                sb.append("N\n");
                continue;
            }
            boolean[] w = new boolean[26];
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if ('a'<=c && c<='z') {
                    w[c-'a'] = true;
                }
            }
            boolean flag = true;
            for (int i=0; i<26; i++) {
                if (!w[i]) {
                    flag = false;
                    break;
                }
            }
            sb.append(flag ? "Y\n" : "N\n");
        }
        System.out.print(sb);
    }
}

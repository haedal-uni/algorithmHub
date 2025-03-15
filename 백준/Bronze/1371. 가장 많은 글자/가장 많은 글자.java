import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] a = new int[26];
        String s;
        while ((s = br.readLine())!= null) {
            for(char c:s.toCharArray()) {
                if (c!=' ') {
                    a[c-'a']++;
                }
            }
        }
        int max = 0;
        for (int num:a) {
            if (num>max) {
                max=num;
            }
        }
        for(int i=0; i<26; i++) {
            if (a[i] == max) {
                sb.append((char) (i + 'a'));
            }
        }
        System.out.print(sb);
    }
}
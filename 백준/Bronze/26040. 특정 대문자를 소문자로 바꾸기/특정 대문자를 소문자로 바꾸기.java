import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String A = br.readLine();
        String[] B = br.readLine().split(" ");
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            boolean flag = false;
            for (String b : B) {
                if (ch == b.charAt(0)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
        System.out.print(sb);
    }
}
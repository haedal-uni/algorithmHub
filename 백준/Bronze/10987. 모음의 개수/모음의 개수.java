import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int sum = 0;
        for (String s:x) {
            if (s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")){
                sum++;
            }
        }
        System.out.print(sum);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int num = 0;
        String[] st = br.readLine().split("");
        for (int i=0; i<st.length; i++){
            num += Integer.parseInt(st[i]);
        }
        System.out.println(num);
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String[] st = br.readLine().split(" ");
        for(int i=0; i<st.length;i++){
            num += (int) Math.pow(Integer.parseInt(st[i]), 2);
        }
        System.out.println(num%10);
    }
}
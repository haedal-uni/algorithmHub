import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        for(int i=0; i<s.length; i+=k){
            sb.append(s[i]);
        }
        System.out.print(sb);
    }
}
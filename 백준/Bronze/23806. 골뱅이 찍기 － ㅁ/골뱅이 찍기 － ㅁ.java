import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        sb1.append("@@@@@");
        sb2.append("@");
        sb3.append("   ");
        for(int i=0; i<n; i++) {
            a.append(sb1.toString().repeat(n)).append("\n");
        }
        for(int i=0; i<n*3; i++) {
            b.append(sb2.toString().repeat(n))
                    .append(sb3.toString().repeat(n))
                    .append(sb2.toString().repeat(n)).append("\n");
        }
        sb.append(a).append(b).append(a);
        System.out.print(sb);
    }
}
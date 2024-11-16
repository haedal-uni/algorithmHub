import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=0; i<n; i++) {
            x = Integer.parseInt(br.readLine());
            a.append(x).reverse();
            x = x+Integer.parseInt(a.toString());
            b.append(x).reverse();
            if(x==Integer.parseInt(b.toString())) {
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
            a.delete(0, a.length());
            b.delete(0, b.length());
        }
        System.out.print(sb);
    }
}
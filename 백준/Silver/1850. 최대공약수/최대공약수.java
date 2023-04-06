import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Long a = Long.parseLong(st.nextToken());
        Long b =Long.parseLong(st.nextToken());
        Long num = A(a,b);
        bw.write("1".repeat(Math.toIntExact(num)));
        bw.flush();
        bw.close();
    }
    public static Long A(Long a, Long b){
        if(a%b==0){
            return b;
        }
        return A(b, a%b);
    }
}
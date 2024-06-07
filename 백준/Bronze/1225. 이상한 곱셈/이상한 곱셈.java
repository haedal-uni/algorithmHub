import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        String[] a = st.nextToken().split("");
        String[] b = st.nextToken().split("");
        long sum = 0;
        for (String s : a) {
            for (String str : b) {
                sum += Long.parseLong(s) * Long.parseLong(str);
            }
        }
        System.out.println(sum);
    }
}
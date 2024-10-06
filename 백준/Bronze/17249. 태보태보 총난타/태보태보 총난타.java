import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"0");
        String x = st.nextToken();
        String y = st.nextToken();
        int a = x.length() - x.replace("@","").length();
        int b = y.length() - y.replace("@","").length();
        System.out.print(a+" "+b);
    }
}
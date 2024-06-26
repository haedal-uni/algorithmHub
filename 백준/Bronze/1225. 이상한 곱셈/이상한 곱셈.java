import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        String a = st.nextToken();
        String b = st.nextToken();
        long sum = 0;
        for (int i=0; i<a.length(); i++) {
            for (int j=0; j<b.length(); j++) {
                sum += (long) (a.charAt(i) - '0') *(b.charAt(j)-'0');
            }
        }
        System.out.println(sum);
    }
}
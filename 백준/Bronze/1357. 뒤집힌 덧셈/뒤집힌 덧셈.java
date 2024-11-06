import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder x = new StringBuilder(st.nextToken()).reverse();
        StringBuilder y = new StringBuilder(st.nextToken()).reverse();
        StringBuilder z = new StringBuilder();
        z.append(Integer.parseInt(x.toString())+Integer.parseInt(y.toString())).reverse();
        System.out.print(Integer.parseInt(z.toString()));
    }
}
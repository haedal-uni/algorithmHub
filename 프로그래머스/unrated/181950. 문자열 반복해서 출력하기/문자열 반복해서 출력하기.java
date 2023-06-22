import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String answer = st.nextToken().repeat(Integer.parseInt(st.nextToken()));
        System.out.println(answer);
    }
}
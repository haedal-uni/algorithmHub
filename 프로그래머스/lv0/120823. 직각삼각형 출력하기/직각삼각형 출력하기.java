
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String a ="*";
        for(int i=1; i<n+1; i++){
            sb.append(a.repeat(i)).append("\n");
        }
        System.out.println(sb);
    }
}
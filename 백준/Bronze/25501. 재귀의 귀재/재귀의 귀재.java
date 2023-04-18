import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-- >0){
            isPalindrome(br.readLine());
        }
        System.out.println(sb);
    }
    public static int recursion(String s, int l, int r){
        count++;
        if(l>=r) {
            sb.append(1).append(" ").append(count).append("\n");
            return count=0;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            sb.append(0).append(" ").append(count).append("\n");
            return count=0;
        }
        else return recursion(s, l+1, r-1);
    }
    public static void isPalindrome(String s){
        recursion(s, 0, s.length() - 1);
    }
}
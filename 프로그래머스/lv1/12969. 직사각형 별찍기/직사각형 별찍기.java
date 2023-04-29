import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String answer = "";
        for(int i=0; i<b; i++){
            answer += "*".repeat(a);
            answer += "\n";
        }

        System.out.println(answer);
    }
}
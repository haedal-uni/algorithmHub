import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean flag = true;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String[] b = st.nextToken().split("");
            if(a.length() != b.length){
                flag = false;
            }else{
                for(String s : b) {
                    if(a.contains(s)) {
                        a = a.replaceFirst(s, "");
                        flag = true;
                    } else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                sb.append("Possible").append("\n");
            }else{
                sb.append("Impossible").append("\n");
            }
        }
        System.out.print(sb);
    }
}
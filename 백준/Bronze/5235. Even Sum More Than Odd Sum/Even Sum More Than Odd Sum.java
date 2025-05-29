import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int even = 0;
        int odd = 0;
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split(" ");
            int m = Integer.parseInt(s[0]);
            even = 0;
            odd = 0;
            for(int j=1; j<m+1; j++){
                x = Integer.parseInt(s[j]);
                if(x%2==0){
                    even+=x;
                }else{
                    odd+=x;
                }
            }
            if(even>odd){
                sb.append("EVEN").append("\n");
            }else if(odd>even){
                sb.append("ODD").append("\n");
            }else{
                sb.append("TIE").append("\n");
            }
        }
        System.out.print(sb);
    }
}
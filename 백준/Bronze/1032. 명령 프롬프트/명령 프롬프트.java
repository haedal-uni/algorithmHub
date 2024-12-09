import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        char[] x = br.readLine().toCharArray();
        char[] y;
        for(int i=1; i<n; i++){
            y=br.readLine().toCharArray();
            for(int j=0; j<y.length; j++){
                if(x[j]!=y[j]){
                    x[j] = '?';
                }
            }
        }
        for(char c : x){
            sb.append(c);
        }
        System.out.print(sb);
    }
}
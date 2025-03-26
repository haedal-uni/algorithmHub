import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] a = {"E","S","T","J"};
        String[] b = {"I","N","F","P"};
        String[] x = br.readLine().split("");
        for(int i=0; i<4; i++){
            if(x[i].equals(a[i])){
                sb.append(b[i]);
            }else{
                sb.append(a[i]);
            }
        }
        System.out.print(sb);
    }
}
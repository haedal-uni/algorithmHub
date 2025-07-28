import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String[] x = br.readLine().split("");
            String y = x[0];
            sb.append(y);
            for(int j=1; j<x.length; j++){
                if(!y.equals(x[j])){
                    sb.append(x[j]);
                    y=x[j];
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
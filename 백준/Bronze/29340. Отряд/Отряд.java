import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        String[] y = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<x.length; i++){
            if(Integer.parseInt(x[i]) > Integer.parseInt(y[i])){
                sb.append(x[i]);
            }else{
                sb.append(y[i]);
            }
        }
        System.out.print(sb);
    }
}
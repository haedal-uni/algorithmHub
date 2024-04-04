import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        br.readLine();
        String[] x = br.readLine().split(" ");
        int y = Integer.parseInt(x[0]);
        int z = 0;
        for(int i=1; i<x.length; i++){
            z = Integer.parseInt(x[i]);
            sb.append(y/a(y,z)).append("/").append((z/a(y,z))).append("\n");
        }
        System.out.println(sb);

    }
    public static int a(int x, int y){
        if(x%y==0){
            return y;
        }
        return a(y, x%y);
    }
}